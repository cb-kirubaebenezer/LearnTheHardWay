package day2.model;
import day2.*;
import day2.interfaces.*;
import utilities.*;
public class Animal extends Mammal implements IBehaviour {
    
    private String type;
    private String breed;
    private Boolean isAlive;
    
    public Animal(String species, String gender, Integer age, String foodHabit){
        super(species,gender,age,foodHabit);
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }

    public void setIsAlive(Boolean isAlive){
        this.isAlive = isAlive;
    }
    public Boolean getIsAlive(){
        return isAlive;
    }

    
    public void eat(){
        super.eat();
        UtilityMethods.print("Animals eat grass to elephant. Which animal you'r referring to?");
    }
    public void speak(){
        super.speak();
        UtilityMethods.print("We do bark, meow, grunt, roar.!!!");
    }
    public void walk(){
        super.walk();
        UtilityMethods.print("We walk to survive. We run to live.");
    }
}