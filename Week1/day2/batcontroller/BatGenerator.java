package day2.batcontroller;
import day2.model.*;
import utilities.UtilityMethods;
public class BatGenerator{
    private BatBuilder batBuilder;
    public void setBatBuilder(BatBuilder batBuilder){
        this.batBuilder = batBuilder;
    }
    public Bat getBat(){
        return batBuilder.getBat();
    }
    /**
    * Call the bat builder to create the bat.
    * Set all the attributes to get the customised bat. 
    */
    public void constructBat(String species, String gender, Integer age, String foodHabit){
        try {
            batBuilder.createABat(species, gender, age, foodHabit);
            batBuilder.buildType();
            batBuilder.buildBreed();
            batBuilder.buildIsAlive(true);
            batBuilder.buildWithName("Jade Smith");
            batBuilder.buildFriendliness(true);
            batBuilder.buildEatNonVeg(true);
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
}