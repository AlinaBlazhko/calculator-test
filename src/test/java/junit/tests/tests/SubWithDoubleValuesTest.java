package junit.tests.tests;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


//@RunWith(RunnerJunit.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
@DisplayName(value = "Test for sub(double a, double b)")
public class SubWithDoubleValuesTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.2, 2.2, 0.0},
                {3.0, -4.0, 7.0},
                {100.0, 0.0, 100.0},
                {-20.0, -10.0, -10.0}
        });
    }

    private double first;
    private double second;
    private double expectedSum;

    public SubWithDoubleValuesTest(double first, double second, double expectedSum) {
        this.first = first;
        this.second = second;
        this.expectedSum = expectedSum;
    }


    @org.junit.Test()
    public void test() {
        System.out.println("Test for sub(double a, double b)");
        System.out.println("a = [" + this.first + "], b = [" + this.second + "], result = [" + calculator.sub(this.first, this.second) + "]");
        Assert.assertTrue(calculator.sub(this.first, this.second) == this.expectedSum);
    }


}
