package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CtgTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI/4, 1.0},
                {0.0, Double.POSITIVE_INFINITY},
                {Math.PI/2, 0.0}
        });
    }

    private double first;
    private double expectedResult;

    public CtgTest(double first, double expectedResult) {
        this.first = first;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void test() {
        System.out.println("Test for ctg(double a)");
        System.out.println("a = [" + this.first + "], expected result = [" + calculator.ctg(this.first) + "]");
        Assert.assertTrue(calculator.ctg(this.first) == this.expectedResult);
    }


}
