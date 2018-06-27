package junit.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by X240 on 6/27/2018.
 */

@DisplayName("Should pass the method parameters provided by the @CsvSource annotation")
class SumTest extends BaseTest{
    @DisplayName("Should calculate the correct sum")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5"
    })
    public void sum(int a, int b, int sum) {
        assertEquals(calculator.sum(a, b), sum);
    }
}
