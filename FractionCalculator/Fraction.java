public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(int num, int den){
        numerator = num;
        denominator = den;

    };
    public Fraction(String input){
        var index = input.indexOf('/');

        var io1 = Integer.parseInt(input.substring(0, index));

        var io2 = Integer.parseInt(input.substring(index+1));


        numerator = io1;


        denominator = io2;
    }
    public Fraction add(Fraction obj){
        var result = new Fraction((this.numerator * obj.denominator)+(obj.numerator * this.denominator),obj.denominator * this.denominator);
        result.simplify();

        return result;

    };
    public Fraction sub(Fraction obj){
        var result = new Fraction((this.numerator * obj.denominator)-(obj.numerator * this.denominator),obj.denominator * this.denominator);
        result.simplify();

        return result;

    };
    private void simplify(){
        while (MathUtil.gcd(this.numerator,this.denominator) != 1){
            var cd = MathUtil.gcd(this.numerator,this.denominator);
            this.numerator /= cd;
            this.denominator /= cd;
        };
        if (this.denominator < 0){
            this.numerator *=-1;
            this.denominator *=-1;
        }
    };
    public String toString(){
        return this.numerator + "/" + this.denominator;

    }





}
