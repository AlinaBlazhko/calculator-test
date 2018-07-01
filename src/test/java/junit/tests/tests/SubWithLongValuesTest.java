package junit.tests.tests;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
@DisplayName(value = "Test for sub(double a, double b)")
public class SubWithLongValuesTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 2, 0},
                {5, -10, 15},
                {143, 0, 143},
                {-130, -120, -10}
        });
    }

    private long first;
    private long second;
    private long expectedResult;

    public SubWithLongValuesTest(long first, long second, long expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void test() {
        System.out.println("Test for sub(long a, long b)");
        System.out.println("a = [" + this.first + "], b = [" + this.second + "], result = [" + calculator.sub(this.first, this.second) + "]");
        Assert.assertTrue(calculator.sub(first, second) == expectedResult);
    }


}
