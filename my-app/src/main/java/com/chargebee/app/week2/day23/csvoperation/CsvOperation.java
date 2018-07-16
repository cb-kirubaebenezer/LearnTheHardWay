package com.chargebee.app.week2.day23.csvoperation;

import com.chargebee.app.week2.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

public class CsvOperation {
    private static final String SAMPLE_CSV_FILE_PATH = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/student.csv";

    public CsvOperation() {

    }

    public void doOperation() {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader,
                    CSVFormat.DEFAULT.withHeader("Student Name", "Fees").withIgnoreHeaderCase().withTrim());
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String name = csvRecord.get(0);
                // Accessing the values by column header name
                String fees = csvRecord.get("fees");
                // Printing the record
                System.out.println("Record Number - " + csvRecord.getRecordNumber());
                System.out.println("Name : " + name);
                System.out.println("Fees : " + fees);
                System.out.println("\n\n");
            }
            csvParser.close();
            reader.close();
        } catch (Exception e) {
            Util.print("Exception " + e.getMessage());
        }
    }
}
