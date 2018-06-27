package testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class MultDoubleTest extends BaseTest {
    @Test(dataProvider = "doubleValuesForMult", groups = "arithmetic")
    public void multDoubleTest(double a, double b, double result){
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.mult(a, b) + "]");
        Assert.assertTrue(calculator.mult(a, b) == result);
    }

    @DataProvider(name = "doubleValuesForMult")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {2.2, 2.0, 4.0},
              {3.0, -4.0, -12.0},
              {100.0, 0.0, 0.0},
              {-2.0, -2.0, 4.0}
      };
    }
}
