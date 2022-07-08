import java.util.Objects;
import java.util.Scanner;

public class homework {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the oper: ");
            String oper = sc.next();
            System.out.println("Please enter first number: ");
            Double num1 = sc.nextDouble();
            System.out.println("Please enter second number: ");
            Double num2 = sc.nextDouble();
            Double result;
            if (Objects.equals(oper, "-")){
                result = num1 - num2;
                System.out.println("the result is " + result);
            }else if (Objects.equals(oper, "+")){
                result = num1 + num2;
                System.out.println("the result is " + result);
            }else if (Objects.equals(oper, "/")){
                result = num1 / num2;
                System.out.println("the result is " + result);
            }else if (Objects.equals(oper, "*")){
                result = num1 * num2;
                System.out.println("the result is " + result);
            }else{
                System.out.println("invalid oper: " + oper);
            }
        }
    }
}
