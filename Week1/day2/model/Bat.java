package day2.model;
import utilities.*;
import day2.*;
import day2.interfaces.*;
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
        UtilityMethods.print("I am a Bat.! Born to fly.");
    }
    public void speak(){
        UtilityMethods.print("I cannot speak...");
    }
    public void walk(){
        UtilityMethods.print("I fly high in the sky......");
    }
}