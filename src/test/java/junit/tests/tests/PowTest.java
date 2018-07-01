package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class PowTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.0, 2.0, 4.0},
                {10.0, 0.0, 1.0},
                {100.0, -1.0, 0.01},
                {-3.0, 3.0, -27.0}
        });
    }

    private double first;
    private double power;
    private double expectedResult;

    public PowTest(double first, double power, double expectedResult) {
        this.first = first;
        this.power = power;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void test() {
        System.out.println("Test for pow(double a)");
        System.out.println("a = [" + this.first + "], power = [" + this.power + "], expected result = [" + calculator.pow(this.first, this.power) + "]");
        Assert.assertTrue(calculator.pow(this.first, this.power) == this.expectedResult);
    }


}
