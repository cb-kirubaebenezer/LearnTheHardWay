package com.chargebee.app.week1.day2.batcontroller;
public class BigBatBuilder extends BatBuilder{
    public void buildType(){
        bat.setType("Bat");
    }
    public void buildBreed(){
        bat.setBreed("Big Bat");
    }
    public void buildIsAlive(Boolean isAlive){
        bat.setIsAlive(isAlive);
    }
    public void buildWithName(String name){
        bat.setName(name);
    }
    public void buildFriendliness(Boolean isFriendly){
        bat.setIsFriendly(isFriendly);
    }
    public void buildEatNonVeg(Boolean isNonVeg){
        bat.setIsNonVeg(isNonVeg);
    }
}