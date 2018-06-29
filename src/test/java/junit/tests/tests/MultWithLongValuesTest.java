package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MultWithLongValuesTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 2, 4},
                {5, -10, -50},
                {143, 0, 0},
                {-2, -5, 10}
        });
    }

    private long first;
    private long second;
    private long expectedResult;

    public MultWithLongValuesTest(long first, long second, long expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void test() {
        System.out.println("Test for mult(long a, long b)");
        System.out.println("a = [" + this.first + "], b = [" + this.second + "], result = [" + calculator.mult(this.first, this.second) + "]");
        Assert.assertTrue(calculator.mult(this.first, this.second) == this.expectedResult);
    }


}
