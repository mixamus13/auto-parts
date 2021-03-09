package com.mixamus.autoparts.opencsv;

import com.mixamus.autoparts.domain.Part;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CsvPartsRepository {

    public static void main(String[] args) {
        getNeedCsvFile("5");
    }

    @SneakyThrows
    public static void getNeedCsvFile(String id) {

        Supplier<String> br1 = () -> getPartCsvId(id, "MOCK_DATA_PARTS_1.csv").toString();
        Supplier<String> br2 = () -> getPartCsvId(id, "MOCK_DATA_PARTS_2.csv").toString();
        Supplier<String> br3 = () -> getPartCsvId(id, "MOCK_DATA_PARTS_3.csv").toString();

        CompletableFuture<String> firsts = CompletableFuture.supplyAsync(br1);
        CompletableFuture<String> seconds = CompletableFuture.supplyAsync(br2);
        CompletableFuture<String> thirds = CompletableFuture.supplyAsync(br3);

        System.out.println(firsts.get());
        System.out.println(seconds.get());
        System.out.println(thirds.get());
    }

    @SneakyThrows
    public static List<Part> getPartCsvId(String id, String fileName) {
        List<Part> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        Part part = new Part();

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            if (values.length > 1 && values[0].equals(id)) {
                part.setId(Integer.parseInt(id));
                part.setNamepart(values[1]);
                part.setVin(values[2]);
                part.setModel(values[3]);
                part.setYear(Integer.parseInt(values[4]));
                records.add(part);
            }
        }
        return records;
    }
}