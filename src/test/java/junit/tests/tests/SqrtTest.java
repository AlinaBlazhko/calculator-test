package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SqrtTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {4.0, 2.0},
                {100.0, 10.0},
                {-900.0, 30.0}
        });
    }

    private double first;
    private double expectedResult;

    public SqrtTest(double first, double expectedResult) {
        this.first = first;
        this.expectedResult = expectedResult;
    }

    @org.junit.Test()
    public void test() {
        System.out.println("Test for sqrt(double a)");
        System.out.println("a = [" + this.first + "], expected result = [" + calculator.sqrt(this.first) + "]");
        Assert.assertTrue(calculator.sqrt(this.first) == this.expectedResult);
    }
}
