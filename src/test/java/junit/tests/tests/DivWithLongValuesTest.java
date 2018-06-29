package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class DivWithLongValuesTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 0, 0},
                {8, -4, -2},
                {-100, -5, 20},
                {20, 2, 10}
        });
    }

    private long first;
    private long second;
    private long expectedSum;

    public DivWithLongValuesTest(long first, long second, long expectedSum) {
        this.first = first;
        this.second = second;
        this.expectedSum = expectedSum;
    }


    @org.junit.Test()
    public void divWithLongValuesTest() {
        System.out.println("Test for div(long a, long b)");
        System.out.println("a = [" + this.first + "], b = [" + this.second + "], result = [" + calculator.div(this.first, this.second) + "]");
        Assert.assertTrue(calculator.div(this.first, this.second) == this.expectedSum);
    }


}
