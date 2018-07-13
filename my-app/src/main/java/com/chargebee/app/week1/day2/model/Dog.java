package com.chargebee.app.week1.day2.model;
import com.chargebee.app.week1.utilities.*;
import com.chargebee.app.week1.day2.interfaces.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.chargebee.app.week1.day2.*;
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
        try {
            super.eat();
            UtilityMethods.print("I am a dog.! Born to eat.");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }   
    }
    public void speak(){
        try {
            super.speak();
            UtilityMethods.print("I am barking...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    public void walk(){
        try {
            super.walk();
            UtilityMethods.print("I have four legs. I can run tooo......");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    *  Return the list of dogs that match with certain predicates.
    *  @param dogs list of dogs to manipulate
    *  @param tester condition to be filtered.
    *  @param mapper map the data for the filtered list.
    *  @param block pipe out the data to caller method.
    */
    public static void getDogList(
        ArrayList<Dog> dogs, 
        Predicate<Dog> tester,
        Function<Dog,String> mapper,
        Consumer<String> block){
        // print all the dogs with predicated attributes   
        try {
            for (Dog dog : dogs) 
            if(tester.test(dog)){
                String data = mapper.apply(dog);
                block.accept(data);
            }
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    *  Return the list of dogs that match with certain predicates.
    *  @param dogs list of dogs to manipulate
    *  @param attribute based on attribute filter the list
    *  @param status on what basis the filter has to work
    */
    public static ArrayList<Dog> getDogListMatchWithAttributs(
        ArrayList<Dog> dogs, 
        String attribute, 
        Boolean status){
        // Inner Class
        try {
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
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
        return dogs;
    }
}