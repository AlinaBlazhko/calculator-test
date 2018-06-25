package tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class IsNegativeTest {
    @Test(dataProvider = "valuesForIsNegative", groups = "other")
    public void sumDoubleTest(long a, boolean result){
        Calculator calculator = new Calculator();
        System.out.println("a = [" + a + "], result = [" + calculator.isNegative(a) + "]");
        Assert.assertTrue(calculator.isNegative(a) == result);
    }

    @DataProvider(name = "valuesForIsNegative")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {-100, true},
              {0, false},
              {40, false}
      };
    }
}
