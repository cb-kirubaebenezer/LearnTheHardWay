import java.util.*;
import util.*;
import day12.*;
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
    */
    private static void day12(){
        try {
            Day12 day12 = new Day12();
            String countData[];
            countData = new String[] {"hello","hello","dog","dog","fish","cat","hi","hi","hi","there","there","there","boss","lol"};
            Util.print("Count of words in map....");
            HashMap<Integer,LinkedList<String> > res = day12.getCountOfWords(countData);
            for (Map.Entry rEntry : res.entrySet()) {
                Util.print(rEntry.getKey().toString());
                Util.print(rEntry.getValue().toString());
            }
            
            String prefixData[];
            prefixData = new String[] {"abcd","abcd","abde","efgh","efgh","hlmn","hlmn","hlmfwfwfwif"};
            Util.print("Common prefix in map....");
            HashMap<String,LinkedList<String> > prefixres = day12.getCommonPrefix(prefixData);
            for (Map.Entry rEntry : prefixres.entrySet()) {
                Util.print(rEntry.getKey().toString());
                Util.print(rEntry.getValue().toString());
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        
    }
}