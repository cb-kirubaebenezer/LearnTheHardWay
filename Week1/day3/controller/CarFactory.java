package day3.controller;

import utilities.*;
import day3.model.*;

public class CarFactory{
    public static Car getCar(String type){
        try {
            if("TRUCK".equalsIgnoreCase(type)){
                return getTruck();
            }
            else if("FORD".equalsIgnoreCase(type)){
                return getFord();
            }
            else if(("SEDAN").equalsIgnoreCase(type)){
                return getSedan();
            }
            
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
        return null;
    }
    private static Truck getTruck(){
        Truck truck = new  Truck();
        try {
            truck.setWeight(10);
            truck.setColor("Blue");
            truck.setRegularPrice(1000.00);
            truck.setSpeed(150);
            truck.setSalePrice(900);
            return truck;
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());   
        }
        return truck;
    }
    private static Sedan getSedan(){
        Sedan sedan = new Sedan();
        try {
            sedan.setLength(10);
            sedan.setColor("Green");
            sedan.setRegularPrice(1000.00);
            sedan.setSpeed(150);
            sedan.setSalePrice(900);
            return sedan;
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
        return sedan;
    }
    private static Ford getFord(){
        Ford ford = new Ford();
        try {
            ford.setManufactureDiscount(10);
            ford.setYear(2012);
            ford.setColor("White");
            ford.setRegularPrice(1000.00);
            ford.setSpeed(150);
            ford.setSalePrice(900);
            return ford;
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
        return ford;
    }
}