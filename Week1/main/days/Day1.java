package main.days;
import utilities.*;
import java.util.*;
import main.days.*;
import main.service.IDays;
import day1.*;

public class Day1 extends IDays{

    private String[] args;
    public Day1(String[] args){
        this.args = args;
    }
    /**
    * Welcome to the day 1.
    */
    public void doWishTheDay(){
        try {
            UtilityMethods.print("Welcome to Day 1...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    public void doOperations(){
        try {
            doWork(this.args);
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    * Greet to the day 1.
    */
    public void doSayGoodBye(){
        try {
            UtilityMethods.print("Hope you have enjoyed the day...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    * Print all the arguments.
    * Add two numbers and print the result. Object created from AddTwoNumbers class.
    * Handled switch case and if-else statements. Object created from CaseHandling class.
    * Find the least power of for x to exceed y.
    */
    private void doWork(String[] args){
        try {
            UtilityMethods.print("Printing all the command line args....");
            for (String x : args) {
                UtilityMethods.print(x);
            }
            
            Scanner reader = new Scanner(System.in);
            UtilityMethods.print("Enter two numbers to add....");
            AddTwoNumbers addTwoNumbers = new AddTwoNumbers(reader.nextInt(),reader.nextInt());
            UtilityMethods.print("Added value " + addTwoNumbers.addTwoNumbers());
    
            UtilityMethods.print("Just enter a number to find it's range....");
            CaseHandling caseHandler = new CaseHandling();
            caseHandler.caseHandler(reader.nextInt());
            UtilityMethods.print("Let's find a number is even or odd.! Put a number :)....");
            caseHandler.oddOrEven(reader.nextInt());
    
            UtilityMethods.print("Enter two numbers x and y. We will find the least power needed to exceed the value y. ");
            FindPower findPower = new FindPower(reader.nextInt(),reader.nextInt());
            UtilityMethods.print("Hope it will cross by here...  " + findPower.findPower());   
               
            reader.close();   
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
        
    } 
}