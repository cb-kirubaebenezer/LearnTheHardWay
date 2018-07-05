package day2.model;
import utilities.*;
import day2.*;
import day2.interfaces.*;
public class Bird extends Mammal implements IBehaviour {
    
    private String type;
    private String breed;
    private Boolean isAlive;

    public Bird(String species, String gender, Integer age, String foodHabit){
        super(species,gender,age,foodHabit);
    }
    
    public String getType(){
        return type;
    }
    public String getBreed(){
        return breed;
    }
    public Boolean getIsAlive(){
        return isAlive;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setIsAlive(Boolean isAlive){
        this.isAlive = isAlive;
    }

    public void eat(){
        UtilityMethods.print("Birds eat fruits to human. Which bird you'r referring to?");
    }
    public void speak(){
        UtilityMethods.print("We don't speak.");
    }
    public void walk(){
        UtilityMethods.print("We fly.");
    }
}