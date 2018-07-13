package com.chargebee.app.week1.day2.model;
import com.chargebee.app.week1.utilities.*;
import com.chargebee.app.week1.day2.*;
import com.chargebee.app.week1.day2.interfaces.*;
public class Bat extends Bird implements IBehaviour{
    
    private String name;
    private Boolean isFriendly;
    private Boolean isNonVeg;
    public Bat(String species, String gender, Integer age, String foodHabit){
        super(species,gender,age,foodHabit);
    }
    
    public void setName(String name){
        this.name = name;
    } 
    public String getName(){
        return name;
    }

    public void setIsFriendly(Boolean isFriendly){
        this.isFriendly = isFriendly;
    }
    public Boolean getIsFriendly(){
        return isFriendly;
    }

    public void setIsNonVeg(Boolean isNonVeg){
        this.isNonVeg = isNonVeg;
    }
    public Boolean getIsNonVeg(){
        return isNonVeg;
    }

    public void eat(){
        try {
            UtilityMethods.print("I am a Bat.! Born to fly.");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    public void speak(){
        try {
            UtilityMethods.print("I cannot speak...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    public void walk(){
        try {
            UtilityMethods.print("I fly high in the sky......");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
}