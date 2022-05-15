//Author: Ivana Tosheva Aleksoska <ivana.toshevaaleksoska@edu.fh-joanneum.at>

package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calcTest;

    @BeforeEach
    public void setUp(){

        calcTest = new Calculator();
    }
    @Test
    public void testAdd(){
        double a = 20;
        double b = 10;
        double expectedResult = 30;
        double result = calcTest.add(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testAdd1(){
        double a = 15;
        double b = 5;
        double expectedResult = a+b;
        double result = calcTest.add(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testMinus(){
        double a = 20;
        double b = 10;
        double expectedResult = 10;
        double result = calcTest.minus(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testMinus1(){
        double a = 8;
        double b = 3;
        double expectedResult = a-b;
        double result = calcTest.minus(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testMultiply(){
        double a = 20;
        double b = 10;
        double expectedResult = 200;
        double result = calcTest.multiply(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testMultiply1(){
        double a = 7;
        double b = 2;
        double expectedResult = a*b;
        double result = calcTest.multiply(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testDivide(){
        double a = 20;
        double b = 10;
        double expectedResult = 2;
        double result = calcTest.divide(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testDivide1(){
        double a = 16;
        double b = 4;
        double expectedResult = 16/4;
        double result = calcTest.divide(a,b);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void factorial() {
        int n = 5;
        long expectedResult = 120;
        long result = calcTest.factorialRec(n);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void factorial1() {
        int n = 12;
        long expectedResult = 479001600;
        long result = calcTest.factorialRec(n);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void factorial2() {
        int n = 3;
        long expectedResult = 6;
        long result = calcTest.factorialRec(n);

        Assertions.assertEquals(expectedResult, result);
    }
}
