package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MultWithDoubleValuesTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.2, 2.0, 4.0},
                {3.0, -4.0, -12.0},
                {100.0, 0.0, 0.0},
                {-2.0, -2.0, 4.0}
        });
    }

    private double first;
    private double second;
    private double expectedResult;

    public MultWithDoubleValuesTest(double first, double second, double expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void multWithDoubleValuesTest() {
        System.out.println("Test for mult(double a, double b)");
        System.out.println("a = [" + this.first + "], b = [" + this.second + "], result = [" + calculator.mult(this.first, this.second) + "]");
        Assert.assertTrue(calculator.mult(this.first, this.second) == this.expectedResult);
    }


}
