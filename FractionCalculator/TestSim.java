public class TestSim {
    public static void test(){

        Expression expression;
        Fraction result;
        /*
        expression = new Expression("3   / 6 + 9/    1            0");

        result = expression.solve();
        System.out.println(result);
        */
        expression = new Expression("1/2-2/2");

        result = expression.solve();
        System.out.println(result);
        expression = new Expression("3   /     6    + 9/    10 -40/7   ");

        result = expression.solve();
        System.out.println( result);


    }
}
