import java.util.*;  
public class Day1 {
    public static void main(String[] args) {
        print("Hello, World!");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = addTwoNumbers(a,b);
        print("Result " + String.valueOf(c));
        caseHandler(c);
        oddOrEven(c);
        Integer x = reader.nextInt();
        Integer number = reader.nextInt();
        Integer y = findPower(x,number);
        print("Result " + String.valueOf(y));
    } 
    public static void print(String data){
        System.out.println(data);
    }
    public static int addTwoNumbers(int a , int b){
        return a + b;
    }
    public static void caseHandler(int a){
        switch(a){
            case 1:
            case 2:
            case 3:
                print("Range between 1 to 3");
                break;
            case 4:
            case 5:
            case 6:
                print("Range 4 to 6");
                break;
            default:
                print("Out of range");
        }
    }
    public static void oddOrEven(int a)
    {
        if(a % 2 == 0) print("Even number.");
        else print("Odd number.");
    }
    public static Integer findPower(Integer x, Integer number){
        if(x >= number) return 1;

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
        return powersOfX.size() + 1;
    }
}