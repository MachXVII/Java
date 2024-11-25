

public class Expression {
    public Expression(String inputExpression){
        expression = inputExpression.replace(" ","");
        System.out.println("Expression after trimming spaces: "+expression);
    };
    public Fraction solve(){


        return execute(expression);
    };
    private Fraction execute(String input){
        var index = getFirstOperatorIndex(input);
        System.out.println(input);

        if (input.indexOf('+') == -1 && input.indexOf('-') == -1){
            return new Fraction(input);
        }
        var oprd1 = new Fraction(input.substring(0,index));
        var oprd2 = input.substring(index+1);
        if (input.charAt(index)=='-'){
            return oprd1.sub(execute(oprd2));
        }else{
            return oprd1.add(execute(oprd2));
        }
    };

    private Fraction executeBinary(String inputExpression){
        var operator = OperationType.ADD;
        var index = inputExpression.indexOf('+');

        if (index == -1){
            index = inputExpression.indexOf('-');
            operator = OperationType.SUBTRACT;
        }

        String input1 = inputExpression.substring(0,index);

        String input2 = inputExpression.substring(index+1);

        var fraction1 = new Fraction(input1);
        var fraction2 = new Fraction(input2);
        if (operator == OperationType.SUBTRACT){
            return fraction1.sub(fraction2);
        }else {
            return fraction1.add(fraction2);
        }
    };

    private int getFirstOperatorIndex(String input){
        var digitFound = false;

        char c;
        for (var i = 0; i < input.length(); i++  ){
            c = input.charAt(i);
            if (digitFound){
                if (c == '+' || c == '-'){
                    return i;
                }
            }
            digitFound = Character.isDigit(c);

        }
        return 0;
    };

    String expression;

}
