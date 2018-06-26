package tests.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class MultLongTest extends BaseTest{
    @Test(dataProvider = "longValuesForMult", groups = "arithmetic")
    public void multLongTest(long a, long b, long result){
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
