package tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class MultLongTest {
    @Test(dataProvider = "longValuesForMult", groups = "arithmetic")
    public void sumDoubleTest(long a, long b, long result){
        Calculator calculator = new Calculator();
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.mult(a, b) + "]");
        Assert.assertTrue(calculator.mult(a, b) == result);
    }

    @DataProvider(name = "longValuesForMult")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {2, 2, 4},
              {5, -10, -50},
              {143, 0, 0},
              {-2, -5, 10}
      };
    }
}
