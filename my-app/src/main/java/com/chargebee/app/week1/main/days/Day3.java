package com.chargebee.app.week1.main.days;
import com.chargebee.app.week1.utilities.*;
import java.util.*;
import com.chargebee.app.week1.day3.controller.CarFactory;
import com.chargebee.app.week1.day3.model.*;
import com.chargebee.app.week1.main.days.*;
import com.chargebee.app.week1.main.service.IDays;

public class Day3 extends IDays{

    public Day3(){

    }
    /**
    * Welcome to the day 3.
    */
    public void doWishTheDay(){
        try {
            UtilityMethods.print("Welcome to Day 3...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    public void doOperations(){
        try {
            doWork();
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    * Greet to the day 3.
    */
    public void doSayGoodBye(){
        try {
            UtilityMethods.print("Hope you have enjoyed the day...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    /**
    * Creating cars with it's sub-class Truck, Sedan and Ford.
    */
    private void doWork(){
        try {
            UtilityMethods.print("Creating cars for you...!"); 
            ArrayList<Car> cars = new ArrayList<Car>();
            cars.add(CarFactory.getCar("Truck"));
            cars.add(CarFactory.getCar("Sedan"));
            cars.add(CarFactory.getCar("Ford"));
            UtilityMethods.print("Created car colors:"); 
            for (Car car : cars) {
                UtilityMethods.print(car.getColor());   
            }
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
    }
}