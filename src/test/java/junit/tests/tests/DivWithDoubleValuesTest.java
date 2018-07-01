package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class DivWithDoubleValuesTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.2, 0.0, Double.POSITIVE_INFINITY},
                {8.0, -4.0, -2.0},
                {-100.0, -5.0, 20.0},
                {20.0, 2.0, 10.0}
        });
    }

    private double first;
    private double second;
    private double expectedResult;

    public DivWithDoubleValuesTest(double first, double second, double expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void test() {
        System.out.println("Test for div(double a, double b)");
        System.out.println("a = [" + this.first + "], b = [" + this.second + "], result = [" + calculator.div(this.first, this.second) + "]");
        Assert.assertTrue(calculator.div(this.first, this.second) == this.expectedResult);
    }


}
