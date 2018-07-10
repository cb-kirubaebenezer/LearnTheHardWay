package main.days;
import utilities.*;
import java.util.*;
import main.service.IDays;
import day2.batcontroller.*;
import day2.dogcontroller.*;
import day2.model.*;
import main.days.*;

public class Day2 extends IDays{

    public Day2(){

    }
    /**
    * Welcome to the day 2.
    */
    public void doWishTheDay(){
        try {
            UtilityMethods.print("Welcome to Day 2...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    * Read the input to create Labrador, Golden retriver or Bat.
    */
    public void doOperations(){
        try {
            UtilityMethods.print("Let's create some mammals.! Please choose the mammal to create.\n1. Labrador\n2. Golden Retriver\n3. Bat");
            Scanner reader = new Scanner(System.in);
            String text = reader.nextLine();
            switch (text) {
                case "1":
                    UtilityMethods.print("You can call him " + createLabrador().getName());
                    break;
                case "2":
                    UtilityMethods.print("You can call him " + createGolderRetriver().getName());
                    break;
                case "3":
                    UtilityMethods.print("You can call him " + createBat().getName());
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    * Greet to the day 2.
    */
    public void doSayGoodBye(){
        try {
            UtilityMethods.print("Hope you have enjoyed the day...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    * Print all the dogs match with attributes predicates.
    * Expressed lambda expressions and aggregations on the list and print the data.
    */
    private void getSomeDogs(){
        try {
            ArrayList<Dog> dogs = new ArrayList<Dog>();
            dogs.add(createLabrador());
            dogs.add(createGolderRetriver());
            
            //Aggregation
            dogs
            .stream()
            .filter(
                d -> (d.getIsRetriever()) 
                && (d.getIsFriendly()))
            .map(p->p.getName())
            .forEach(name -> UtilityMethods.print(name));

            //lambda expressions
            Dog.getDogList(
                dogs, 
                d -> (d.getIsRetriever()) 
                    && (d.getIsFriendly()), 
                m -> m.getName(),
                o -> UtilityMethods.print(o)
                );

        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
    }
    /**
    * Create object for dog generator.
    * Create object for dog builder for labrador.
    * Using dog generator construct the dog and set the attributes.
    * Expose the behaviour of the dog.   
    */
    private static Dog createLabrador(){
        try {
            UtilityMethods.print("Creating labrador for you...!");   
            DogGenerator dogGenerator = new DogGenerator();
            DogBuilder labradorDogBuilder = new LabradorBuilder();
            dogGenerator.setDogBuilder(labradorDogBuilder);
            dogGenerator.constructDog(
                "Animal",
                "Male",
                20,
                "Carnivores"
            );
            Dog labradordog = dogGenerator.getDog();
            UtilityMethods.print("\n"); 
            labradordog.eat();
            UtilityMethods.print("\n"); 
            labradordog.speak();
            UtilityMethods.print("\n"); 
            labradordog.walk();
            UtilityMethods.print("\n"); 
            return labradordog;
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
        return null;
    }
    /**
    * Create object for dog generator.
    * Create object for dog builder for golden retriver.
    * Using dog generator construct the dog and set the attributes.
    * Expose the behaviour of the dog.   
    */
    private static Dog createGolderRetriver(){
        try {
            UtilityMethods.print("Creating golden retriver for you...!"); 
            DogGenerator dogGenerator = new DogGenerator();
            DogBuilder goldenRetriver = new GoldenRetriverBuilder();
            dogGenerator.setDogBuilder(goldenRetriver);
            dogGenerator.constructDog(
                "Animal", 
                "Male",
                20,
                "Carnivores"
            );
            Dog goldenRetriverdog = dogGenerator.getDog();
            UtilityMethods.print("\n"); 
            goldenRetriverdog.eat();
            UtilityMethods.print("\n"); 
            goldenRetriverdog.speak();
            UtilityMethods.print("\n"); 
            goldenRetriverdog.walk();
            UtilityMethods.print("\n"); 
            return goldenRetriverdog;    
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
        return null; 
    }
    /**
    * Create object for bat generator.
    * Create object for bat builder for big bat.
    * Using bat generator construct the bat and set the attributes.
    * Expose the behaviour of the bat.   
    */
    private static Bat createBat(){
        try {
            UtilityMethods.print("Creating Big bat for you...!"); 
            BatGenerator batGenerator = new BatGenerator();
            BatBuilder bigBatBuilder = new BigBatBuilder();
            batGenerator.setBatBuilder(bigBatBuilder);
            batGenerator.constructBat(
                "Bat", 
                "Male",
                25,
                "Scavenger"
            );
            Bat bigBat = bigBatBuilder.getBat();
            UtilityMethods.print("\n"); 
            bigBat.eat();
            UtilityMethods.print("\n"); 
            bigBat.speak();
            UtilityMethods.print("\n"); 
            bigBat.walk();
            UtilityMethods.print("\n"); 
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
        return null; 
    }
}