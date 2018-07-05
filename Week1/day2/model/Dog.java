package day2.model;
import utilities.*;
import day2.interfaces.*;
import day2.*;
public class Dog extends Animal implements IBehaviour{
    
    private String name;
    private Boolean isFriendly;
    private Boolean isRetriever;
    public Dog(String species, String gender, Integer age, String foodHabit){
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

    public void setIsRetriver(Boolean isRetriever)
    {
        this.isRetriever = isRetriever;
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