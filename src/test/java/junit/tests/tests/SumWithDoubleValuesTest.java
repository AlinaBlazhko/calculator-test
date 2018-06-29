package junit.tests.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SumWithDoubleValuesTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.2, 2.8, 5.0},
                {3.0, -4.0, -1.0},
                {100.0, 0.0, 100.0}
        });
    }

    private double first;
    private double second;
    private double expectedResult;


    public SumWithDoubleValuesTest(double first, double second, double expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }

    @Test()
    public void sumWithDoubleValuesTest() {
        System.out.println("Test for sum(double a, double b)");
        System.out.println("a = [" + first + "], b = [" + second + "], result = [" + calculator.sum(first, second) + "]");
        Assert.assertTrue(calculator.sum(first, second) == this.expectedResult);
    }


}
