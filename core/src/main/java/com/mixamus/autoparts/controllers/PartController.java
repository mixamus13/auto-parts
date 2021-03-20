package com.mixamus.autoparts.controllers;

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

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@AllArgsConstructor
public class PartController {

  final PartsService partsService;

  /**
   * Get all parts.
   *
   * @return all parts.
   */
  @GetMapping("/parts/")
  public List<Part> getAllParts() {
    return partsService.getAllParts();
  }

//    @GetMapping("parts/{id}")
//    public Optional<Part> getPartById(@PathVariable int id) {
//        return partsService.getPartById(id);
//    }

  /**
   * Get part from id.
   *
   * @param id number of part.
   * @return part with all data.
   */
  @GetMapping("/parts/{id}")
  EntityModel<Part> getPartById(@PathVariable int id) {

    Part part = partsService.getPartById(id) //
        .orElseThrow(() -> new PartNotFoundException(id));

    return EntityModel.of(part, //
        linkTo(methodOn(PartController.class).getPartById(id)).withSelfRel(),
        linkTo(methodOn(PartController.class).getAllParts()).withRel("parts"));
  }

  /**
   * Create new part.
   *
   * @param part part.
   * @return new part.
   */
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/parts/")
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
    Part newPart = new Part();
    newPart.setId(id);
    newPart.setNamepart(partDtoV1.getNamepart());
    newPart.setVin(partDtoV1.getVin());
    newPart.setModel("n/a");
    newPart.setYear(partDtoV1.getYear());
    partsService.updatePartById(newPart);
  }

  /**
   * Update part by id V1.
   *
   * @param id        part.
   * @param partDtoV2 part's PartDtoV2.
   */
  @PutMapping("/v2/parts/{id}")
  public void updatePartById(@PathVariable int id, @RequestBody PartDtoV2 partDtoV2) {
    Part newPart = new Part();
    newPart.setId(id);
    newPart.setNamepart(partDtoV2.getNamepart());
    newPart.setVin(partDtoV2.getVin());
    newPart.setModel(partDtoV2.getModel());
    newPart.setYear(partDtoV2.getYear());
    partsService.updatePartById(newPart);
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

  //    private final PartsRepository partsRepository;
//    private final CsvPartsRepository csvPartsRepository;
//
//    @Autowired
//    public PartController(PartsRepository partsRepository, CsvPartsRepository csvPartsRepository) {
//        this.partsRepository = partsRepository;
//        this.csvPartsRepository = csvPartsRepository;
//    }
//
//    /**
//     * Get part from id.
//     * @param id number of part.
//     * @return part with all data.
//     */
//    @GetMapping("part/{id}")
//    public List<String> getPartByIdCsv(@PathVariable int id) {
//        return csvPartsRepository.getPartCsvId(id);
//    }
//
//    @GetMapping("/part/find{namePart}")
//    public boolean findPartByStatus(@PathVariable String namePart) {
//        return partsRepository.findPartByStatus(namePart);
//    }
//
//    @PostMapping("part/")
//    public Part createNewPart(Part part) {
//        return partsRepository.create(part);
//    }
//
//    @PostMapping("part/{namePart}/uploadImage")
//    public void uploadImage(@PathVariable String image) {
//        partsRepository.uploadImage(image);
//    }
//
//    @PutMapping("part/{namePart}")
//    public Part updatePartNamePart(@PathVariable Part namePart) {
//        return partsRepository.update(namePart);
//    }
//
//    @DeleteMapping("part/{namePart}")
//    public void deletePart(@PathVariable String namePart) {
//        partsRepository.delete(namePart);
//    }
}
