package com.mixamus.autoparts.opencsv;

import com.mixamus.autoparts.domain.Part;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CsvPartsRepository {

    private final static Logger logger = LoggerFactory.getLogger(CsvPartsRepository.class);

    public static void main(String[] args) {
        getNeedCsvFile("2");
    }

    /**
     * @param id
     */
    @SneakyThrows
    public static void getNeedCsvFile(String id) {

        Supplier<String> br1 = () -> getPartCsvId(id, "MOCK_DATA_PARTS_1.csv").toString();
        Supplier<String> br2 = () -> getPartCsvId(id, "MOCK_DATA_PARTS_2.csv").toString();
        Supplier<String> br3 = () -> getPartCsvId(id, "MOCK_DATA_PARTS_3.csv").toString();

        var firsts = CompletableFuture.supplyAsync(br1);
        var seconds = CompletableFuture.supplyAsync(br2);
        var thirds = CompletableFuture.supplyAsync(br3);

        logger.info("firsts.get() {}", firsts.get());
        logger.info("seconds.get() {}", seconds.get());
        logger.info("thirds.get() {}", thirds.get());
    }

    /**
     * @param id       Part.
     * @param fileName file write.
     * @return Part.
     */
    @SneakyThrows
    public static List<Part> getPartCsvId(String id, String fileName) {
        List<Part> records = new ArrayList<>();
        try (var br = new BufferedReader(new FileReader(fileName))) {
            Part part = new Part();

            br.lines()
                .map(line -> line.split(","))
                .filter(values -> values.length > 1 && values[0].equals(id))
                .forEach(values -> {
                    part.setId(Integer.parseInt(id));
                    part.setNamepart(values[1]);
                    part.setVin(values[2]);
                    part.setModel(values[3]);
                    part.setYear(Integer.parseInt(values[4]));
                    records.add(part);
                });
        }
        return records;
    }
}
