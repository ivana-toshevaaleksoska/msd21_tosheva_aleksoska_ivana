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
    public void testMinus(){
        double a = 20;
        double b = 10;
        double expectedResult = 10;
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
    public void testDivide(){
        double a = 20;
        double b = 10;
        double expectedResult = 2;
        double result = calcTest.divide(a,b);

        Assertions.assertEquals(expectedResult,result);
    }
}
