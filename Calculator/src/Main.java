import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double a;
        double b;
        System.out.print("Enter equation: ");
        var input = new Scanner(System.in);

        if  (input.hasNextInt()){
            a = input.nextInt();
        } else
            a = input.nextDouble();
        String op = input.next();
        if  (input.hasNextInt()){
            b = input.nextInt();
        } else
            b = input.nextDouble();
        System.out.print("The answer is " + Calculator.calculate(op, a, b));
    }
}
