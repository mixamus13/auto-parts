package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.dto.PartDtoV1;
import com.mixamus.autoparts.dto.PartDtoV2;
import com.mixamus.autoparts.exceptions.PartNotFoundException;
import com.mixamus.autoparts.service.PartsService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequiredArgsConstructor
public class PartController {

  private final PartsService partsService;

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

    Part part = partsService.getPartById(id)
      .orElseThrow(() -> new PartNotFoundException(id));

    return EntityModel.of(part,
      linkTo(methodOn(PartController.class).getPartById(id)).withSelfRel(),
      linkTo(methodOn(PartController.class).getAllParts()).withRel("parts"));
  }

  @GetMapping("/parts/{id}")
  public Optional<Part> getPartById(@PathVariable int id) {
    return partsService.getPartById(id);
  }

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
  @PutMapping("/parts/v1/{id}")
  public void updatePartById(@PathVariable int id, @RequestBody PartDtoV1 partDtoV1) {
    partsService.updatePartByIdV1(id, partDtoV1, partsService);
  }

  /**
   * Update part by id V1.
   *
   * @param id        part.
   * @param partDtoV2 part's PartDtoV2.
   */
  @PutMapping("/parts/v2/{id}")
  public void updatePartById(@PathVariable int id, @RequestBody PartDtoV2 partDtoV2) {
    partsService.updatePartByIdV2(id, partDtoV2, partsService);
  }

  @DeleteMapping("/parts/{id}")
  public void deletePartById(@PathVariable int id) {
    partsService.deleteById(id);
  }


  @GetMapping("/parts/find{namePart}")
  public boolean findPartByStatus(@PathVariable String namePart) {
    return partsService.findPartByStatus(namePart);
  }

  @PostMapping("/parts/{namePart}/uploadImage")
  public void uploadImage(@PathVariable String namePart) {
    partsService.uploadImage(namePart);
  }
}
