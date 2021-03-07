package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.PartsService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PartController {

    PartsService partsService;

    @GetMapping("parts/")
    public List<Part> getAllParts() {
        return partsService.getAllUsers();
    }

    @GetMapping("parts/{id}")
    public Optional<Part> getAllPartById(@PathVariable Integer id) {
        return partsService.getPartById(id);
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
