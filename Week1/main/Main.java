import day1.*;
import day2.model.*;
import utilities.*;
import java.util.*;  
public class Main {
    public static void main(String[] args) {
        try {
            day2();
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
        finally{
            
        }
    }
    public static void day1(String[] args){
        try {
            for (String x : args) {
                UtilityMethods.print(x);
            }
            
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
        
    } 
    public static void day2(){
        try {
            UtilityMethods.print("---------------");   
            Dog dog = new Dog("Animal", "Male",20,"Carnivores","Dog","Labrador",true,"Jude",true,true);
            dog.eat();
            dog.walk();
            dog.speak();
            UtilityMethods.print("---------------");   
            Bat bat = new Bat("Bird", "Female",20,"Scavangers","Bat","ManEaters",true,"Jude",false,true);
            bat.eat();
            bat.walk();
            bat.speak(); 
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
    }
}