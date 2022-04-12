package at.fhj.msd;

public class Calculator {
    public static double add (double number1, double number2){
        return number1+number2;
    }
    public static double minus (double number1, double number2){
        return number1-number2;
    }
    public static double divide (double number1, double number2){
        double quotient = number1 / number2;
        if (Double.isNaN(quotient) || Double.isInfinite(quotient))
            throw new ArithmeticException("Division " + number1 + " / " + number2 + " isn't possible");

        return number1/number2;
    }
    public static double multiply (double number1, double number2){
        return number1*number2;
    }
}
