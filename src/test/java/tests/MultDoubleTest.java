package tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class MultDoubleTest {
    @Test(dataProvider = "doubleValuesForMult", groups = "arithmetic")
    public void sumDoubleTest(double a, double b, double result){
        Calculator calculator = new Calculator();
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
