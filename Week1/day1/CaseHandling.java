package day1;
import utilities.*;
import java.util.*;  
public class CaseHandling {
    public CaseHandling(){

    }
    public void caseHandler(int a){
        try {
            switch(a){
                case 1:
                case 2:
                case 3:
                    UtilityMethods.print("Range between 1 to 3");
                    break;
                case 4:
                case 5:
                case 6:
                    UtilityMethods.print("Range 4 to 6");
                    break;
                default:
                    UtilityMethods.print("Out of range");
            }
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    public void oddOrEven(int a)
    {
        try {
            if(a % 2 == 0) UtilityMethods.print("Even number.");
            else UtilityMethods.print("Odd number.");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        } 
    }
}

