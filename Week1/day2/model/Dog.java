package day2.model;
import utilities.*;
import day2.interfaces.*;

import java.util.*;

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

    public static ArrayList<Dog> getDogListMatchWithAttributs(ArrayList<Dog> dogs, String attribute, Boolean status){
        // Inner Class
        class DogWithAttributes{
            private ArrayList<Dog> dogs;
            private Boolean status;
            DogWithAttributes(ArrayList<Dog> dogs,Boolean status){
                this.dogs = dogs;
                this.status = status;
            }
            protected ArrayList<Dog> getDogsMatchStatusWithFriendly(){
                ArrayList<Dog> dogsFreindlyList = new ArrayList<Dog>();
                for (Dog  dog : dogs) {
                    if(status == true){
                        if(dog.getIsFriendly())
                            dogsFreindlyList.add(dog);
                    }else{
                        if(! (dog.getIsFriendly()))
                            dogsFreindlyList.add(dog);
                    }
                }
                return dogsFreindlyList;
            }
            protected ArrayList<Dog> getDogsMatchStatusWithRetrieveness(){
                ArrayList<Dog> dogsRetriverList = new ArrayList<Dog>();
                for (Dog  dog : dogs) {
                    if(status == true){
                        if(dog.getIsRetriever())
                            dogsRetriverList.add(dog);
                    }else{
                        if(! (dog.getIsRetriever()))
                            dogsRetriverList.add(dog);
                    }
                }
                return dogsRetriverList;
            }
        }
        DogWithAttributes dogWithAttributes = new DogWithAttributes(dogs,status);
        if(attribute.equals("Friendly"))
            return dogWithAttributes.getDogsMatchStatusWithFriendly();
        else if(attribute.equals("Retreiver"))
            return dogWithAttributes.getDogsMatchStatusWithRetrieveness();
        return dogs;
    }
}