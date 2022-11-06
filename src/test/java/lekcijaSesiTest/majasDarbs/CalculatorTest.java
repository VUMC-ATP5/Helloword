package lekcijaSesiTest.majasDarbs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test

    public <Add> void testAdd(){
Calculator mansCalculator = new Calculator();
int num1 = 4; int num2 = 6;
int excpectedResult = 8;
        int result = num1+num2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, result);

    }
    @Test
     public void testSubtraction(){
        int num1 = 10; int num2 = 1;
        int expectedResultresult = 18;
        

    }
}