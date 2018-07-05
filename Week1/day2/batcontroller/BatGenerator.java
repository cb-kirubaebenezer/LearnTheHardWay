package day2.batcontroller;
import day2.model.*;
public class BatGenerator{
    private BatBuilder batBuilder;
    public void setBatBuilder(BatBuilder batBuilder){
        this.batBuilder = batBuilder;
    }
    public Bat getBat(){
        return batBuilder.getBat();
    }
    public void constructBat(String species, String gender, Integer age, String foodHabit){
        batBuilder.createABat(species, gender, age, foodHabit);
        batBuilder.buildType();
        batBuilder.buildBreed();
        batBuilder.buildIsAlive(true);
        batBuilder.buildWithName("Jade");
        batBuilder.buildFriendliness(true);
        batBuilder.buildEatNonVeg(true);
    }
}