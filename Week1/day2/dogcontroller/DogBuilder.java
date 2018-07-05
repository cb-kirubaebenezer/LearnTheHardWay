package  day2.dogcontroller;
import day2.model.*;
import utilities.*;
public abstract class DogBuilder
{
    protected Dog dog;

    public Dog getDog(){
        return dog;
    }
    public void createADog(String species, String gender, Integer age, String foodHabit){
        dog = new Dog(species, gender, age, foodHabit);
    }
    
    public abstract void buildType();
    public abstract void buildBreed();
    public abstract void buildIsAlive(Boolean isAlive);
    public abstract void buildWithName(String name);
    public abstract void buildFriendliness(Boolean isFriendly);
    public abstract void buildRetriveness(Boolean isRetriver);
}