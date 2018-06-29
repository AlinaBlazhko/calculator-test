package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CosTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI/2, 0.0},
                {0, 1.0},
                {Math.PI, -1.0}
        });
    }

    private double first;
    private double expectedResult;

    public CosTest(double first, double expectedResult) {
        this.first = first;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void test() {
        System.out.println("Test for cos(double a)");
        System.out.println("a = [" + this.first + "], expected result = [" + calculator.cos(this.first) + "]");
        Assert.assertTrue(calculator.cos(this.first) == this.expectedResult);
    }


}
