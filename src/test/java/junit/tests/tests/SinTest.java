package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SinTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI/2, 1.0},
                {0, 0.0},
                {Math.PI, 0.0},
                {Math.PI/6, 0.5}
        });
    }

    private double first;
    private double expectedResult;

    public SinTest(double first, double expectedResult) {
        this.first = first;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void sinTest() {
        System.out.println("Test for sin(double a)");
        System.out.println("a = [" + this.first + "], expected result = [" + calculator.sin(this.first) + "]");
        Assert.assertTrue(calculator.sin(this.first) == this.expectedResult);
    }


}
