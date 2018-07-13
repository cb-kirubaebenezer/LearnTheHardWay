package com.chargebee.app.week1.utilities;
import java.util.*;
public class UtilityMethods{
    public static void print(String data){
        try {
            System.out.println(data); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Integer converStringToInteger(String data){
        try {
            return Integer.parseInt(data);
        } catch (Exception e) {
            print(e.getMessage());
        }
        return 0;
    }
    public static String convertIntegerToString(Integer data){
        try {
            return String.valueOf(data);
        } catch (Exception e) {
            print(e.getMessage());
        }
        return "";
    }
}