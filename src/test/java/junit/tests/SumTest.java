package junit.tests;


import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by X240 on 6/27/2018.
 */

public class SumTest extends BaseTest {

//    @Test
//    public void test(){
//        Assert.assertTrue(true);
//    }
    @ParameterizedTest
    @CsvSource({
            "2.6, 3.4, 6.0",
            "2.0, -2.0, 0.0",
            "30.3, -50.0, -19.7",
            "-30.0, -20.0, -50.0",
            "0.0, 89.0, 89.0",
            "0.0, -3.3, -3.3"
    })
    public void sumWithDoubleValuesTest(double a, double b, double result) {
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.sum(a, b) + "]");
        Assert.assertTrue(calculator.sum(a, b) == result);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 4, 6",
            "2, -2, 0",
            "30, -50, -20",
            "-30, -20, -50",
            "0, 89, 89",
            "0, -3, -3"
    })
    public void sumWithLongValuesTest(long a, long b, long result) {
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.sum(a, b) + "]");
        Assert.assertTrue(calculator.sum(a, b) == result);
    }
}
