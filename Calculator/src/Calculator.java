public class Calculator {
    public static double calculate(String op, double a, double b){
        double answer = 0;
        switch(op){
            case ("+"):
                answer = a+b;
                break;
            case ("-"):
                answer = a-b;
                break;
            case ("*"):
                answer =  a*b;
                break;
            case ("/"):
                answer = a/b;
                break;

        }
        return answer;
    };



}
