package testng.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class SumDoubleTest{
    @Test(dataProvider = "doubleValuesForSum", groups = "arithmetic")
    public void sumDoubleTest(double a, double b, double result){
        Calculator calculator = new Calculator();
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.sum(a, b) + "]");
        Assert.assertTrue(calculator.sum(a, b) == result);
    }

    @DataProvider(name = "doubleValuesForSum")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {2.2, 2.8, 5.0},
              {3.0, -4.0, -1.0},
              {100.0, 0.0, 100.0}
      };
    }
}
