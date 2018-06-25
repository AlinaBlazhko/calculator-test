package tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class CosTest {
    @Test(dataProvider = "valuesForCos", groups = "trigonometric")
    public void cosTest(double a, double result){
        Calculator calculator = new Calculator();
        System.out.println("Cos(" + a  + "): " + Math.cos(a));
        Assert.assertTrue(calculator.cos(a) == result);
    }

    @DataProvider(name = "valuesForCos")
    public Object[][] valuesForCos(){

            return new Object[][]{
                    {Math.PI/2, 0.0},
                    {0, 1.0},
                    {Math.PI, -1.0}
            };
    }
}
