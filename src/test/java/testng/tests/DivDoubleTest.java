package testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class DivDoubleTest extends BaseTest {
    @Test(dataProvider = "doubleValuesForDiv", groups = "arithmetic")
    public void divDoubleTest(double a, double b, double result){
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.div(a, b) + "]");
        Assert.assertTrue(calculator.div(a, b) == result);
    }

    @DataProvider(name = "doubleValuesForDiv")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {2.2, 0.0, Double.POSITIVE_INFINITY},
              {8.0, -4.0, -2.0},
              {-100.0, -5.0, 20.0},
              {20.0, 2.0, 10.0}
      };
    }
}
