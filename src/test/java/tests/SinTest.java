package tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class SinTest {
    @Test(dataProvider = "valuesForSin", groups = "trigonometric")
    public void sinTest(double a, double result){
        Calculator calculator = new Calculator();
        System.out.println("Sin(" + a  + "): " + Math.sin(a));
        Assert.assertTrue(Math.round(calculator.sin(a)) == result);
    }

    @DataProvider(name = "valuesForSin")
    public Object[][] valuesForCos(){

            return new Object[][]{
                    {Math.PI/2, 1.0},
                    {0, 0.0},
                    {Math.PI, 0.0},
                    {Math.PI/6, 0.5}
            };
    }
}
