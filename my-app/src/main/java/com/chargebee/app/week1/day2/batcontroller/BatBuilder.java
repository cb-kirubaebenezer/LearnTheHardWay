package  com.chargebee.app.week1.day2.batcontroller;
import com.chargebee.app.week1.day2.model.*;
public abstract class BatBuilder
{
    protected Bat bat;
    /**
    *  Return the bat.
    */
    public Bat getBat(){
        return bat;
    }
    /**
    *  Attributes to create the mammal object.
    */
    public void createABat(String species, String gender, Integer age, String foodHabit){
        bat = new Bat(species, gender, age, foodHabit);
    }
    
    public abstract void buildType();   //build the type of the bat
    public abstract void buildBreed();  //build the breed of the bat
    public abstract void buildIsAlive(Boolean isAlive); //check if the bat is alive
    public abstract void buildWithName(String name);    //set the name for bat
    public abstract void buildFriendliness(Boolean isFriendly); //build the bat with friendliness
    public abstract void buildEatNonVeg(Boolean isNonVeg);  //build the bat vegan.
}