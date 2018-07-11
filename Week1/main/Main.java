import main.days.*;
import utilities.*;
import java.util.*;

public class Main {
    /**
     * Main method to initiate the days operation. Acts as start point.
     * Read the input to create object for Day 1,2,3.
     */
    public static void main(String[] args) {
        try {
            UtilityMethods.print("Good Day!. Please choose the day to run.\n1. Day 1\n2. Day 2\n3. Day 3");
            Scanner reader = new Scanner(System.in);
            String text = reader.nextLine();
            switch (text) {
                case "1":
                    day1(args);
                    break;
                case "2":
                    day2();
                    break;
                case "3":
                    day3();
                    break;
                default:
                    break;
            }
            reader.close();
        } catch (Exception
            UtilityMethods.print(e.getMessage());
        }
        finally{
            UtilityMethods.print("Good bye Bee!.");
        }
    }
    /**
     * Day 1 operations.
     */
    private static void day1(String[] args){
        try {
            Day1 day1 = new Day1(args);
            day1.doWishTheDay();
            day1.doOperations();
            day1.doSayGoodBye();
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
     * Day 2,3,4,5 operations are mixed in this method.
     */
    private static void day2(){
        try {
            Day2 day2 = new Day2();
            day2.doWishTheDay();
            day2.doOperations();
            day2.doSayGoodBye();
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
     * Day 2,3,4,5 operations are mixed in this method.
     */
    private static void day3(){
        try {
            Day3 day3 = new Day3();
            day3.doWishTheDay();
            day3.doOperations();
            day3.doSayGoodBye();
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
}