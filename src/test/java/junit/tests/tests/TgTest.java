package junit.tests.tests;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TgTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI/4, Math.tan(Math.PI/4)},
                {0.0, Math.tan(0.0)},
                {Math.PI, Math.tan(Math.PI)}
        });
    }

    private double first;
    private double expectedResult;

    public TgTest(double first, double expectedResult) {
        this.first = first;
        this.expectedResult = expectedResult;
    }


    @org.junit.Test()
    public void tgTest() {
        System.out.println("Test for tg(double a)");
        System.out.println("a = [" + this.first + "], expected result = [" + calculator.tg(this.first) + "]");
        Assert.assertTrue(calculator.tg(this.first) == this.expectedResult);
    }


}
