package com.chargebee.app.week2;
import java.io.BufferedReader;
import java.io.FileReader;
import com.chargebee.app.week2.util.*;
import com.google.gson.Gson;
import com.chargebee.app.week2.day12.*;
import com.chargebee.app.week2.day23.csvoperation.CsvOperation;
import com.chargebee.app.week2.day23.fileoperation.*;
import com.chargebee.app.week2.day23.school.MyClass;
public class Week2App {
    /**
     * Main method to initiate the days operation. Acts as start point.
     */
    public static void main(String[] args) {
        try {
            // day12();
            // day23();
            day5();
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        
    }
    /** 
     * day 1 and 2 tasks.
     * create a map with the "length of the word" as key and value as the "list of words with that length"
     * create a map with the common prefix(first 3 characters) as key and value as the list of words that starts with that prefix
     * Phone book directory demo app.
    */
    private static void day12(){
        try {
            Day12 day12 = new Day12();
            day12.doTask();
        } catch (Exception e) {
            Util.print(e.getMessage());
        }

    }
    /**
     * Print files extensions and file names under that extension.
     * Move the files from/to a directory
     * Count all the words in a file and out the words and it's count.
     * Search a keyword from a file.
     */
    private static void day23(){
        try {
            FileOperation fileOperation = new FileOperation();
            fileOperation.doFileOperation();

        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }
    private static void day5(){
        try {
            Gson gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader("/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/students-teachers.json"));
            MyClass myClass = gson.fromJson(br, MyClass.class);
            Util.print(myClass.getStudent().getName());
            Util.print(myClass.getTeacher().getName());
            
            CsvOperation csvOperation = new CsvOperation();
            csvOperation.cleanUpCSV();
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }
}