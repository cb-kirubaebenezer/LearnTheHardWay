package  day2.dogcontroller;
import day2.model.*;
import utilities.*;

public abstract class DogBuilder
{
    protected Dog dog;
    /**
    *  Return the dog.
    */
    public Dog getDog(){
        return dog;
    }
    /**
    *  Attributes to create the mammal object.
    */
    public void createADog(String species, String gender, Integer age, String foodHabit){
        dog = new Dog(species, gender, age, foodHabit);
    }
    
    public abstract void buildType();   //build the type of the dog
    public abstract void buildBreed();  //build the breed of the dog
    public abstract void buildIsAlive(Boolean isAlive); //check if the dog is alive
    public abstract void buildWithName(String name);    //set the name for dog
    public abstract void buildFriendliness(Boolean isFriendly); //build the dog with friendliness
    public abstract void buildRetriveness(Boolean isRetriver); //build the dog with retriveness.
}