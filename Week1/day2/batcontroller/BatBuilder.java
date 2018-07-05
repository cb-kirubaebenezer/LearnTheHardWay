package  day2.batcontroller;
import day2.model.*;
import utilities.*;
public abstract class BatBuilder
{
    protected Bat bat;

    public Bat getBat(){
        return bat;
    }
    public void createABat(String species, String gender, Integer age, String foodHabit){
        bat = new Bat(species, gender, age, foodHabit);
    }
    
    public abstract void buildType();
    public abstract void buildBreed();
    public abstract void buildIsAlive(Boolean isAlive);
    public abstract void buildWithName(String name);
    public abstract void buildFriendliness(Boolean isFriendly);
    public abstract void buildEatNonVeg(Boolean isNonVeg);
}