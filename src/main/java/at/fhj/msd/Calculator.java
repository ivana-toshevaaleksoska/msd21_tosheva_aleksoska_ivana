//Author: Ivana Tosheva Aleksoska <ivana.toshevaaleksoska@edu.fh-joanneum.at>

package at.fhj.msd;

public class Calculator {

    /**
     * @author Ivana Tosheva Aleksoska
     * @param number1 the first number in the addition (first addend)
     * @param number2 the second number in the addition (second addend)
     * @return the result of the addition (sum)
     *
     */
    public static double add(double number1, double number2) {
        Main.logger.debug("Parameters: " + number1 + " , "+ number2);
        return number1 + number2;
    }

    /**
     *
     * @author Ivana Tosheva Aleksoska
     * @param number1 the first number in the subtraction (minuend)
     * @param number2 the second number in the subtraction (subtrahend)
     * @return the result of the subtraction (difference)
     */
    public static double minus(double number1, double number2) {
        Main.logger.debug("Parameters: " + number1 + " , " + number2);
        return number1 - number2;
    }

    /**
     *
     * @author Ivana Tosheva Aleksoska
     * @param number1 the first number in the division (dividend)
     * @param number2 the second number in the division (divisor)
     * @return the result of the division (quotient)
     * @throws ArithmeticException that is caught when division with 0 happens
     */
    public static double divide(double number1, double number2) {
        Main.logger.debug("Parameters: " + number1 + " , " + number2);

        double quotient;
        if (number2 == 0) {
            Main.logger.error("Division with 0!");
            throw new ArithmeticException("Division " + number1 + " / " + number2 + " isn't possible");
        }
        else {
            quotient = number1 / number2;
        }

        return number1 / number2;
    }

    /**
     *
     * @author Ivana Tosheva Aleksoska
     * @param number1 the first number in the multiplication (multiplicand)
     * @param number2 the second number in the multiplication (multiplier)
     * @return the result of the multiplication (product)
     */
    public static double multiply(double number1, double number2) {
        Main.logger.debug("Parameters: " + number1 + " , " + number2);
        return number1 * number2;
    }

    /**
     *
     * @author Ivana Tosheva Aleksoska
     * @param n the number of which we are finding the factorial
     * @return the result of the factorial calculation
     */
    public long factorialRec(int n) {
        if (n <= 2) {
            return n;
        }
        if (n < 0) {
            return 0;
        }
        return n * factorialRec(n - 1);


    }
}
