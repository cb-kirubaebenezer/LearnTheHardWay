import day1.*;
import utilities.*;
import java.util.*;  
public class Main {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);

            AddTwoNumbers addTwoNumbers = new AddTwoNumbers(reader.nextInt(),reader.nextInt());
            UtilityMethods.print(addTwoNumbers.addTwoNumbers());

            CaseHandling caseHandler = new CaseHandling();
            caseHandler.caseHandler(reader.nextInt());
            caseHandler.oddOrEven(reader.nextInt());

            FindPower findPower = new FindPower(reader.nextInt(),reader.nextInt());
            UtilityMethods.print("Result " + findPower.findPower());   
               
            reader.close();      
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
        finally{
            
        }
    } 
}