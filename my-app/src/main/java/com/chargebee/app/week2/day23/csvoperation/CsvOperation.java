package com.chargebee.app.week2.day23.csvoperation;

import com.chargebee.app.week2.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import org.apache.commons.csv.CSVPrinter;

public class CsvOperation {
    private static final String SAMPLE_CSV_FILE_PATH = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/student.csv";
    private static final String INPUT_CSV_PATH = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/input.csv";
    private static final String OUTPUT_CSV_PATH = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/output.csv";
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
                CSVObject csvobject = new CSVObject();
                csvobject.setCustomerId(csvRecord.get("Customer Id"));
                csvobject.setSubsciptionId(csvRecord.get("Subscription Id"));
                csvobject.setInvoiceNumber(csvRecord.get("Invoice Number"));
                csvobject.setInvoiceDate(csvRecord.get("Invoice Date"));
                csvobject.setStartDate(csvRecord.get("Start Date"));
                csvobject.setAmount(csvRecord.get("Amount"));
                csvobject.setStatus(csvRecord.get("Status"));
                csvobject.setPaidOn(csvRecord.get("Paid On"));
                csvobject.setNextEntry(csvRecord.get("Next Retry"));
                csvobject.setRefundedAmount(csvRecord.get("Refunded Amount"));
                csvobject.setRecurring(csvRecord.get("Recurring"));
                csvobject.setFirstInvoice(csvRecord.get("First Invoice"));
                
                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                Customer customer =  new Customer(csvRecord.get("Customer First Name"), 
                                                    csvRecord.get("Customer Last Name"),
                                                    csvRecord.get("Customer Email"), 
                                                    csvRecord.get("Customer Company"));
                csvobject.setCustomer(customer);
                String customerJsonString = gson.toJson(customer);
                csvobject.setCustomerJsonString(customerJsonString);
                csvobject.setTaxTotal(csvRecord.get("Tax Total"));
                
                CSVWriter(csvobject);
            }
            csvParser.close();
            reader.close();
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }
    private void CSVWriter(CSVObject csvobject){
        try {
            Writer writer = Files.newBufferedWriter(Paths.get(OUTPUT_CSV_PATH));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Customer Id", "Subscription Id","Invoice Number",
            "Invoice Date","Start Date","Amount","Status","Paid On","Next Retry","Refunded Amount",
            "Recurring","First Invoice","Tax Total","Customer Details"));
            //Writing records in the generated CSV file
            csvPrinter.printRecord(csvobject.getCustomerId(), csvobject.getSubscriptionId(),
            csvobject.getInvoiceNumber(),csvobject.getInvoiceDate(),csvobject.getStartDate(),csvobject.getAmount(),
            csvobject.getStatus(),csvobject.getPaidOn(),csvobject.getNextRetry(),csvobject.getRefundedAmount(),
            csvobject.getRecurring(),csvobject.getFirstInvoice(),csvobject.getTaxTotal(),csvobject.getCustomerJsonString());

            csvPrinter.flush();
            csvPrinter.close();
        } catch (Exception e) {
           
        }
    }
}
