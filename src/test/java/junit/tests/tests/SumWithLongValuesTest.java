package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


//@RunWith(RunnerJunit.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class SumWithLongValuesTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0},
                {1, 1, 2},
                {-2, 0, -2},
                {-9, 5, -4}
        });
    }

    private long first;
    private long second;
    private long expectedResult;

    public SumWithLongValuesTest(long first, long second, long expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }

    @org.junit.Test()
    public void sumWithLongValuesTest() {
        System.out.println("Test for sum(long a, long b)");
        System.out.println("a = [" + this.first + "], b = [" + this.second + "], result = [" + calculator.sum(this.first, this.second) + "]");
        Assert.assertTrue(calculator.sum(this.first, this.second) == this.expectedResult);
    }


}
