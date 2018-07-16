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
    private static final String INPUT_CSV_PATH = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/input.csv";
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
            Util.print(e.getMessage());
        }
    }
    public void cleanUpCSV(){
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(INPUT_CSV_PATH));
            CSVParser csvParser = new CSVParser(reader,
                    CSVFormat.DEFAULT.withHeader("Customer Id", "Subscription Id","Invoice Number",
                    "Invoice Date","Start Date","Amount","Status","Paid On","Next Retry","Refunded Amount",
                    "Recurring","First Invoice","Customer First Name","Customer Last Name","Customer Email",
                    "Customer Company","Tax Total").withIgnoreHeaderCase().withTrim());
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
    
                String customerId = csvRecord.get("Customer Id");
                String subscriptionId = csvRecord.get("Subscription Id");
                String invoiceNumber = csvRecord.get("Invoice Number");
                String invoiceDate = csvRecord.get("Invoice Date");
                String startDate = csvRecord.get("Start Date");
                String amount = csvRecord.get("Amount");
                String status = csvRecord.get("Status");
                String paidOn = csvRecord.get("Paid On");
                String nextRetry = csvRecord.get("Next Retry");
                String refundedAmount = csvRecord.get("Refunded Amount");
                String recurring = csvRecord.get("Recurring");
                String firstInvoice = csvRecord.get("First Invoice");

                String customerFirstName = csvRecord.get("Customer First Name");
                String customerLastaName = csvRecord.get("Customer Last Name");
                String customerEmail = csvRecord.get("Customer Email");
                String customerCompany = csvRecord.get("Customer Company");
                String taxTotal = csvRecord.get("Tax Total");
               
                System.out.println("Record Number - " + csvRecord.getRecordNumber());
                System.out.println("Customer Id : " + customerId);
                System.out.println("Recurring : " + recurring);
                System.out.println("Subscription Id : " + subscriptionId);
                
                System.out.println("\n\n");
            }
            csvParser.close();
            reader.close();
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }
}
