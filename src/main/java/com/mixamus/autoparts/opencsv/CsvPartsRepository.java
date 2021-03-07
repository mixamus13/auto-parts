package com.mixamus.autoparts.opencsv;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@Component
public class CsvPartsRepository {

//    @SneakyThrows
//    @Async
//    public List<String> getPartCsvId(int id) {
//        List<List<String>> records = new ArrayList<>();
//
//        Supplier<String> br1 = () -> {
//            try {
//                return String.valueOf(new BufferedReader(new FileReader("MOCK_DATA_PARTS_1.csv")));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            throw new RuntimeException();
//        };
//
//        Supplier<String> br2 = () -> {
//            try {
//                return String.valueOf(new BufferedReader(new FileReader("MOCK_DATA_PARTS_2.csv")));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            throw new RuntimeException();
//        };
//
//        Supplier<String> br3 = () -> {
//            try {
//                return String.valueOf(new BufferedReader(new FileReader("MOCK_DATA_PARTS_3.csv")));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            throw new RuntimeException();
//        };
//
//        CompletableFuture<String> firsts = CompletableFuture.supplyAsync(br1);
//        CompletableFuture<String> seconds = CompletableFuture.supplyAsync(br2);
//        CompletableFuture<String> thirds = CompletableFuture.supplyAsync(br3);
//        String line;
//
//        CompletableFuture<Void> combine = CompletableFuture.allOf(firsts, seconds, thirds);
//
////        while ((line = combine.isCancelled()) != null) {
////            String[] values = line.split(",");
////            records.add(Arrays.asList(values));
////        }
//        return records.get(id);
//    }


    /**
     * Get part from csv file from id.
     *
     * @param id number part in file.
     * @return Part for id.
     */
    @SneakyThrows
    public List<String> getPartCsvId(int id) {
        List<List<String>> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA_PARTS_1.csv"));
        BufferedReader br1 = new BufferedReader(new FileReader("MOCK_DATA_PARTS_2.csv"));
        BufferedReader br2 = new BufferedReader(new FileReader("MOCK_DATA_PARTS_3.csv"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            records.add(Arrays.asList(values));
        }
        return records.get(id);
    }
}