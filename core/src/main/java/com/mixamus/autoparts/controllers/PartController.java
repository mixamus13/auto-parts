package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Client;
import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.dto.PartDtoV1;
import com.mixamus.autoparts.dto.PartDtoV2;
import com.mixamus.autoparts.exceptions.PartNotFoundException;
import com.mixamus.autoparts.service.PartsService;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class PartController {

    final PartsService partsService;

    public PartController(PartsService partsService) {
        this.partsService = partsService;
    }

    /**
     * Get all parts.
     *
     * @return all parts.
     */
    @GetMapping("/parts/")
    public List<Part> getAllParts() {
        return partsService.getAllParts();
    }

    /**
     * Get part from id Hateoas.
     *
     * @param id number of part.
     * @return part with all data.
     */
    @GetMapping("/parts/hat/{id}")
    EntityModel<Part> getPartByIdHateoas(@PathVariable int id) {

        Part part = partsService.getPartById(id) //
                .orElseThrow(() -> new PartNotFoundException(id));

        return EntityModel.of(part,
                linkTo(methodOn(PartController.class).getPartById(id)).withSelfRel(),
                linkTo(methodOn(PartController.class).getAllParts()).withRel("parts"));
    }

    @GetMapping("/parts/{id}")
    public Optional<Part> getPartById(@PathVariable int id) {
        return partsService.getPartById(id);
    }

    /**
     * Create new part.
     *
     * @param part part.
     * @return new part.
     */
    @PostMapping("/parts/")
    @ResponseStatus(HttpStatus.CREATED)
    public Part createPart(@RequestBody Part part) {
        return partsService.createPart(part);
    }

    /**
     * Update part by id V1.
     *
     * @param id        part.
     * @param partDtoV1 part's PartDtoV1.
     */
    @PutMapping("/v1/parts/{id}")
    public void updatePartById(@PathVariable int id, @RequestBody PartDtoV1 partDtoV1) {
        partsService.updatePartByIdV1(id, partDtoV1, partsService);
    }

    /**
     * Update part by id V1.
     *
     * @param id        part.
     * @param partDtoV2 part's PartDtoV2.
     */
    @PutMapping("/v2/parts/{id}")
    public void updatePartById(@PathVariable int id, @RequestBody PartDtoV2 partDtoV2) {
        partsService.updatePartByIdV2(id, partDtoV2, partsService);
    }

    /**
     * Delete part by id.
     *
     * @param id when to need delete Entity.
     */
    @DeleteMapping("/parts/{id}")
    public void deletePartById(@PathVariable int id) {
        partsService.deleteById(id);
    }

    /**
     * Find part by status.
     *
     * @param namePart status.
     * @return status for part.
     */
    @GetMapping("/parts/find{namePart}")
    public boolean findPartByStatus(@PathVariable String namePart) {
        return partsService.findPartByStatus(namePart);
    }

    /**
     * Upload image by by name.
     *
     * @param namePart upload image.
     */
    @PostMapping("/parts/{namePart}/uploadImage")
    public void uploadImage(@PathVariable String namePart) {
        partsService.uploadImage(namePart);
    }
}
