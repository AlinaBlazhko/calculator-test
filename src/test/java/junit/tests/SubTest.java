package junit.tests;


import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Created by X240 on 6/27/2018.
 */

@DisplayName("Should pass with correct result after sub(a, b) function")
public class SubTest extends BaseTest {

    @ParameterizedTest
    @CsvSource({
            "2.6, 3.4, -0.8",
            "2.0, -2.0, 4.0",
            "30.3, -50.0, 80.3",
            "-30.0, -20.0, -10.0",
            "0.0, 89.0, -89.0",
            "0.0, -3.3, 3.3"
    })
    public void subWithDoubleValuesTest(double a, double b, double result) {
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.sub(a, b) + "]");
        Assert.assertTrue(calculator.sub(a, b) == result);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 4, -2",
            "2, -2, 4",
            "30, -50, 80",
            "-30, -20, -10",
            "0, 89, -89",
            "0, -3, 3"
    })
    public void subWithLongValuesTest(long a, long b, long result) {
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.sub(a, b) + "]");
        Assert.assertTrue(calculator.sub(a, b) == result);
    }
}
