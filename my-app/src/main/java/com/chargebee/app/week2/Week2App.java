package com.chargebee.app.week2;
import java.util.*;
import com.chargebee.app.week2.util.*;
import com.google.gson.Gson;
import com.chargebee.app.week2.day12.*;
import com.chargebee.app.week2.day23.*;
import com.chargebee.app.week2.day23.fileoperation.*;
import com.chargebee.app.week2.day12.phonedirectory.week2model.*;
public class Week2App {
    /**
     * Main method to initiate the days operation. Acts as start point.
     */
    public static void main(String[] args) {
        try {
            // day12();
            day23();
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
    private static void day23(){
        try {
            Gson gson = new Gson();
            FileOperation fileOperation = new FileOperation();
            fileOperation.doFileOperation();
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }
}