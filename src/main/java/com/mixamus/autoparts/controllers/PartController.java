package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.dto.PartDto;
import com.mixamus.autoparts.service.PartsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PartController {

    PartsService partsService;

    /**
     * Get all parts.
     *
     * @return all parts.
     */
    @GetMapping("parts/")
    public List<Part> getAllParts() {
        return partsService.getAllUsers();
    }

    /**
     * Get part from id.
     *
     * @param id number of part.
     * @return part with all data.
     */
    @GetMapping("parts/{id}")
    public Optional<Part> getPartById(@PathVariable int id) {
        return partsService.getPartById(id);
    }

    /**
     * Create new part.
     *
     * @param part part.
     * @return new part.
     */
    @PostMapping("parts/")
    public Part createPart(Part part) {
        return partsService.createPart(part);
    }

    /**
     * Update part by id.
     *
     * @param
     * @return
     */
    @PutMapping("part/{id}")
    public void updatePartById(@PathVariable int id, @RequestBody PartDto partDto) {
        Part part = new Part();
        part.setId(id);
        part.setVin(part.getVin());
        partsService.updatePartById(part);
    }

    /**
     * Delete part by id.
     *
     * @param id
     */
    @DeleteMapping("part/{id}")
    public void deletePartById(@PathVariable int id) {
        partsService.deleteById(id);
    }

    /**
     * Find part by status.
     *
     * @param namePart
     * @return
     */
    @GetMapping("/part/find{namePart}")
    public boolean findPartByStatus(@PathVariable String namePart) {
        return partsService.findPartByStatus(namePart);
    }

    /**
     * Upload image by by name.
     *
     * @param image
     */
    @PostMapping("part/{namePart}/uploadImage")
    public void uploadImage(@PathVariable String image) {
        partsService.uploadImage(image);
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
