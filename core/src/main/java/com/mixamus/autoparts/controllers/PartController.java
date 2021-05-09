package com.mixamus.autoparts.controllers;

import static org.springframework.hateoas.EntityModel.of;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.dto.PartDtoV1;
import com.mixamus.autoparts.dto.PartDtoV2;
import com.mixamus.autoparts.exceptions.PartNotFoundException;
import com.mixamus.autoparts.service.PartsService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PartController {

  private final PartsService partsService;

  @GetMapping("/parts/")
  public List<Part> getAllParts() {
    return partsService.getAllParts();
  }

  @GetMapping("/parts/hat/{id}")
  EntityModel<Part> getPartByIdHateoas(@PathVariable int id) {
    Part part = partsService.getPartById(id)
      .orElseThrow(() -> new PartNotFoundException(id));
    return of(part,
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

  @PutMapping("/parts/v1/{id}")
  public void updatePartById(@PathVariable int id, @RequestBody PartDtoV1 partDtoV1) {
    partsService.updatePartByIdV1(id, partDtoV1, partsService);
  }

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
