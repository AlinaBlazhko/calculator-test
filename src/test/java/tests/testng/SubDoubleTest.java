package tests.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class SubDoubleTest {
    @Test(dataProvider = "doubleValuesForSub", groups = "arithmetic")
    public void subDoubleTest(double a, double b, double result){
        Calculator calculator = new Calculator();
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.sub(a, b) + "]");
        Assert.assertTrue(calculator.sub(a, b) == result);
    }

    @DataProvider(name = "doubleValuesForSub")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {2.2, 2.2, 0.0},
              {3.0, -4.0, 7.0},
              {100.0, 0.0, 100.0},
              {-20.0, -10.0, -10.0}
      };
    }
}
