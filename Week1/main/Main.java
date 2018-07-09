import day1.*;
import day2.batcontroller.*;
import day2.dogcontroller.*;
import day2.model.*;
import utilities.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            //day1(args);
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
    private static Dog createLabrador(){
        try {
            UtilityMethods.print("\n\nCreating labrador....................\n\n");   
            DogGenerator dogGenerator = new DogGenerator();
            DogBuilder labradorDogBuilder = new LabradorBuilder();
            dogGenerator.setDogBuilder(labradorDogBuilder);
            dogGenerator.constructDog("Animal", "Male",20,"Carnivores");
            Dog labradordog = dogGenerator.getDog();
            labradordog.eat();
            labradordog.speak();
            labradordog.walk();
            return labradordog;
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
        return null;
    }
    private static Dog createGolderRetriver(){
        try {
            UtilityMethods.print("\n\nCreating golden retriver....................\n\n"); 
            DogGenerator dogGenerator = new DogGenerator();
            DogBuilder goldenRetriver = new GoldenRetriverBuilder();
            dogGenerator.setDogBuilder(goldenRetriver);
            dogGenerator.constructDog("Animal", "Male",20,"Carnivores");
            Dog goldenRetriverdog = dogGenerator.getDog();
            goldenRetriverdog.eat();
            goldenRetriverdog.speak();
            goldenRetriverdog.walk();
            return goldenRetriverdog;    
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
        return null; 
    }
    private static Bat createBat(){
        try {
            UtilityMethods.print("\n\nCreating Big bat....................\n\n"); 
            BatGenerator batGenerator = new BatGenerator();
            BatBuilder bigBatBuilder = new BigBatBuilder();
            batGenerator.setBatBuilder(bigBatBuilder);
            batGenerator.constructBat("Bat", "Male",25,"Scavenger");
            Bat bigBat = bigBatBuilder.getBat();
            bigBat.eat();
            bigBat.speak();
            bigBat.walk();
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
        return null; 
    }
    public static void day2(){
        try {
            ArrayList<Dog> dogs = new ArrayList<Dog>();
            dogs.add(createLabrador());
            dogs.add(createGolderRetriver());
            Dog.getDogList(
                dogs, 
                d -> (d.getIsRetriever()) 
                    && (d.getIsFriendly()), 
                o -> UtilityMethods.print(o.getName())
                );

        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
    }
}