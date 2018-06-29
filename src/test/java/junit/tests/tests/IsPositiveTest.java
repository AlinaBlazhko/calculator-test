package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class IsPositiveTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {-100, false},
                {0, false},
                {40, true}
        });
    }

    private long first;
    private boolean expectedResult;

    public IsPositiveTest(long first, boolean expectedResult) {
        this.first = first;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void test() {
        System.out.println("Test for isPositive(long a)");
        System.out.println("a = [" + this.first + "], expected result = [" + calculator.isPositive(this.first) + "]");
        Assert.assertTrue(calculator.isPositive(this.first) == this.expectedResult);
    }


}
