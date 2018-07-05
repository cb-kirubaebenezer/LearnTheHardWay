package day2.model;
import utilities.*;
import day2.*;
import day2.interfaces.*;
public class Bat extends Bird implements IBehaviour{
    
    private String name;
    private Boolean isFriendly;
    private Boolean isNonVeg;
    public Bat(String species, String gender, Integer age, String foodHabit,String type, String breed, Boolean isAlive,String name, Boolean isFriendly, Boolean isNonVeg){
        super(species,gender,age,foodHabit,type,breed,isAlive);
        this.name = name;
        this.isFriendly = isFriendly;
        this.isNonVeg = isNonVeg;
    }
    
    public String getName(){
        return name;
    }
    public Boolean getIsFriendly(){
        return isFriendly;
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