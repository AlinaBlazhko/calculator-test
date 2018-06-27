package junit.tests;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SimpleTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1, 0 },
                { 1, 0, 2 }
        });
    }

    private final Calculator calculator;
    private final int first;
    private final int second;
    private final int expectedSum;

    public SimpleTest(int first,
                                  int second,
                                  int expectedSum) {

        this.first = first;
        this.second = second;
        this.expectedSum = expectedSum;
        this.calculator = new Calculator();
    }

    @org.junit.Test
    public void test(){
        System.out.println("a = [" + first + "], b = [" + second + "], result = [" + calculator.sum(first, second) + "]");
        Assert.assertTrue(calculator.sum(first, second) == expectedSum);
    }


}
