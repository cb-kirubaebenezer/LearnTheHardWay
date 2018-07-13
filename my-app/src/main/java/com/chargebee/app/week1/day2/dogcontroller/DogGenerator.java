package com.chargebee.app.week1.day2.dogcontroller;
import com.chargebee.app.week1.day2.model.*;
import com.chargebee.app.week1.utilities.*;
public class DogGenerator{
    private DogBuilder dogBuilder;
    public void setDogBuilder(DogBuilder dogBuilder){
        this.dogBuilder = dogBuilder;
    }
    public Dog getDog(){
        return dogBuilder.getDog();
    }
    
    /**
    * Call the dog builder to create the dog.
    * Set all the attributes to get the customised dog. 
    */
    public void constructDog(String species, String gender, Integer age, String foodHabit){
        try {
            dogBuilder.createADog(species, gender, age, foodHabit);
            dogBuilder.buildType();
            dogBuilder.buildBreed();
            dogBuilder.buildIsAlive(true);
            dogBuilder.buildWithName("Justin Bieber");
            dogBuilder.buildFriendliness(true);
            dogBuilder.buildRetriveness(true);
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
}