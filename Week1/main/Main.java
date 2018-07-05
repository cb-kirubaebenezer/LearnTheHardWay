import day1.*;
import day2.dogcontroller.*;
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
            DogGenerator dogGenerator = new DogGenerator();
            DogBuilder labradorDogBuilder = new LabradorBuilder();
            dogGenerator.setDogBuilder(labradorDogBuilder);
            dogGenerator.constructDog("Animal", "Male",20,"Carnivores");
            Dog labradordog = dogGenerator.getDog();
            labradordog.eat();
            labradordog.speak();
            labradordog.walk();

            DogBuilder goldenRetriver = new GoldenRetriverBuilder();
            dogGenerator.setDogBuilder(goldenRetriver);
            dogGenerator.constructDog("Animal", "Male",20,"Carnivores");
            Dog godlenRetriverdog = dogGenerator.getDog();
            godlenRetriverdog.eat();
            godlenRetriverdog.speak();
            godlenRetriverdog.walk();
            

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