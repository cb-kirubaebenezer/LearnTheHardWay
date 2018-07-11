import java.util.*;
import util.*;
import day12.*;
import day12.phonedirectory.week2model.*;
public class Main {
    /**
     * Main method to initiate the days operation. Acts as start point.
     */
    public static void main(String[] args) {
        try {
            day12();
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
}