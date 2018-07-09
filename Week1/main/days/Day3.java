package main.days;
import utilities.*;
import java.util.*;
import day3.controller.CarFactory;
import day3.model.*;
import main.days.*;
import main.service.IDays;

public class Day3 extends IDays{

    public Day3(){

    }
    
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
    public void doSayGoodBye(){
        try {
            UtilityMethods.print("Hope you have enjoyed the day...");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }

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