package com.chargebee.app.week1.day2.dogcontroller;
import com.chargebee.app.week1.day2.model.*;
/**
*  Model for Golden retriver dog extends the Dog Builder abstract.
*/
public class GoldenRetriverBuilder extends DogBuilder{
    public void buildType(){
        dog.setType("Dog");
    }
    public void buildBreed(){
        dog.setBreed("Golden Retriver");
    }
    public void buildIsAlive(Boolean isAlive){
        dog.setIsAlive(isAlive);
    }
    public void buildWithName(String name){
        dog.setName(name);
    }
    public void buildFriendliness(Boolean isFriendly){
        dog.setIsFriendly(isFriendly);
    }
    public void buildRetriveness(Boolean isRetriever){
        dog.setIsRetriver(isRetriever);
    }
}