package day2.model;
import utilities.*;
import day2.interfaces.*;
import day2.*;
public class Dog extends Animal implements IBehaviour{
    
    private String name;
    private Boolean isFriendly;
    private Boolean isRetriever;
    public Dog(String species, String gender, Integer age, String foodHabit,String type, String breed, Boolean isAlive,String name, Boolean isFriendly, Boolean isRetriver){
        super(species,gender,age,foodHabit,type,breed,isAlive);
        this.name = name;
        this.isFriendly = isFriendly;
        this.isRetriever = isRetriver;
    }
    
    public String getName(){
        return name;
    }
    public Boolean getIsFriendly(){
        return isFriendly;
    }
    public Boolean getIsRetriever(){
        return isRetriever;
    }
    public void eat(){
        super.eat();
        UtilityMethods.print("I am a dog.! Born to eat.");
    }
    public void speak(){
        super.speak();
        UtilityMethods.print("I am barking...");
    }
    public void walk(){
        super.walk();
        UtilityMethods.print("I have four legs. I can run tooo......");
    }
}