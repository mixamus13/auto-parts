package com.mixamus.autoparts.opencsv;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CsvUsersRepository {

    public static void main(String[] args) {
        System.out.println("Part csv by Id = " + getPartCsvId(5));
    }

    /**
     * Get user from csv file from id.
     * @param id number user in file.
     * @return Part for id.
     */

    @SneakyThrows
    public static List<String> getPartCsvId(int id) {
        List<List<String>> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA_USERS.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            records.add(Arrays.asList(values));
        }
        return records.get(id);
    }
}
