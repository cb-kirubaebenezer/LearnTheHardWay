package com.chargebee.app.week1.day1;
import com.chargebee.app.week1.utilities.*;
import java.util.*;  
public class AddTwoNumbers {
    private Integer a;
    private Integer b;
    public AddTwoNumbers(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }
    public String addTwoNumbers(){
        return UtilityMethods.convertIntegerToString((a + b));
    }
}
