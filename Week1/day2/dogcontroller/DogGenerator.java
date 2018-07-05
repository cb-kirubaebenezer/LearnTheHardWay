package day2.dogcontroller;
import day2.model.*;
public class DogGenerator{
    private DogBuilder dogBuilder;
    public void setDogBuilder(DogBuilder dogBuilder){
        this.dogBuilder = dogBuilder;
    }
    public Dog getDog(){
        return dogBuilder.getDog();
    }
    public void constructDog(String species, String gender, Integer age, String foodHabit){
        dogBuilder.createADog(species, gender, age, foodHabit);
        dogBuilder.buildType();
        dogBuilder.buildBreed();
        dogBuilder.buildIsAlive(true);
        dogBuilder.buildWithName("Justin Bieber");
        dogBuilder.buildFriendliness(true);
        dogBuilder.buildRetriveness(true);
    }
}