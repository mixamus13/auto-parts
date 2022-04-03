package com.mixamus.autoparts.opencsv;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import lombok.Cleanup;

import java.io.*;
import java.util.*;

public class WriteCsvInMap {

    public static void main(String[] args) throws IOException {

        List<HashMap<String, String>> myArrList = new ArrayList<>();
        HashMap<String, String> map;

        /*** Rows 1 ***/
        map = new HashMap<>();
        map.put("id", "1");
        map.put("namePart", "Jaguar");
        map.put("vin", "WBADW3C56CE437448");
        map.put("model", "XJ Series");
        map.put("year", "2020");
        myArrList.add(map);

        /*** Rows 2 ***/
        map = new HashMap<>();
        map.put("id", "2");
        map.put("namePart", "Lincoln");
        map.put("vin", "KNDMG4C71E6532505");
        map.put("model", "Navigator");
        map.put("year", "2005");
        myArrList.add(map);

        /*** Rows 3 ***/
        map = new HashMap<>();
        map.put("id", "3");
        map.put("namePart", "Toyota");
        map.put("vin", "2HNYB1H47CH135562");
        map.put("model", "Supra");
        map.put("year", "1995");
        myArrList.add(map);

        /*** Rows 4 ***/
        map = new HashMap<>();
        map.put("id", "4");
        map.put("namePart", "Porsche");
        map.put("vin", "1G6AE1RXXF0846207");
        map.put("model", "911");
        map.put("year", "1990");
        myArrList.add(map);

        /*** Rows 5 ***/
        map = new HashMap<>();
        map.put("id", "5");
        map.put("namePart", "Jeep");
        map.put("vin", "JH4CL96878C525510");
        map.put("model", "Grand Cherokee");
        map.put("year", "2000");
        myArrList.add(map);

        File file = new File("example.csv");
        // Create a File and append if it already exists.
        Writer writer = new FileWriter(file, true);
        Reader reader = new FileReader(file);

        // Copy List of Map Object into CSV format at specified File location.
        csvWriter(myArrList, writer);

        // Read CSV format from specified File location and print on console..
        csvReader(reader);
    }

    /**
     * @param listOfMap
     * @param writer
     * @throws IOException
     */
    public static void csvWriter(List<HashMap<String, String>> listOfMap, Writer writer) throws IOException {
        CsvSchema schema = null;
        CsvSchema.Builder schemaBuilder = CsvSchema.builder();
        if (listOfMap != null && !listOfMap.isEmpty()) {
            for (String col : listOfMap.get(0).keySet()) {
                schemaBuilder.addColumn(col);
            }
            schema = schemaBuilder.build().withLineSeparator("\r").withHeader();
        }
        CsvMapper mapper = new CsvMapper();
        mapper.writer(schema).writeValues(writer).writeAll(listOfMap);
        writer.flush();
    }

    /**
     * @param collection
     * @param writer
     * @param
     * @throws IOException
     */
    public static void csvWriter(Collection collection, Writer writer) throws IOException {
        if (collection != null && collection.size() > 0) {
            CsvMapper mapper = new CsvMapper();
            Object[] objects = collection.toArray();
            Class type = objects[0].getClass();
            CsvSchema schema = mapper.schemaFor(type).withHeader();
            mapper.writer(schema).writeValues(writer).write(objects);
        } else {
            writer.write("No Data");
        }
        writer.flush();
    }

    /**
     * @param reader
     * @throws IOException
     */

    public static void csvReader(Reader reader) throws IOException {
        Iterator<Map<String, String>> iterator = new CsvMapper()
            .readerFor(Map.class)
            .with(CsvSchema.emptySchema().withHeader())
            .readValues(reader);
        while (iterator.hasNext()) {
            Map<String, String> keyVals = iterator.next();
            System.out.println("Mapa: " + keyVals);
        }
    }
}
