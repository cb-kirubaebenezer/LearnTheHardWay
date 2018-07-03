package day1;
import utilities.*;
import java.util.*;  
public class FindPower {
    private Integer x;
    private Integer number;
    public FindPower(Integer a, Integer b){
        this.x = a;
        this.number = b;
    }
    public String findPower(){
        try {
            if(x >= number) return UtilityMethods.convertIntegerToString(1);
            ArrayList<Integer> powersOfX = new ArrayList<Integer>();
            Integer value = 0;
            powersOfX.add(x);
            while(true){
                Integer last = powersOfX.get(powersOfX.size()-1);
                value = last * x;
                if(value < number)
                    powersOfX.add(value);
                else break;
            }
            return UtilityMethods.convertIntegerToString(powersOfX.size() + 1);
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
        return UtilityMethods.convertIntegerToString(-1);
    }
}
