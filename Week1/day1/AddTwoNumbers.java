package day1;
import utilities.*;
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
