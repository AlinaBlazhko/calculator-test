package testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class SinTest extends BaseTest {
    @Test(dataProvider = "valuesForSin", groups = "trigonometric")
    public void sinTest(double a, double result){
        System.out.println("Sin(" + a  + "): " + Math.sin(a));
        Assert.assertTrue(calculator.sin(a) == result);
    }

    @DataProvider(name = "valuesForSin")
    public Object[][] valuesForCos(){

        return new Object[][]{
                {Math.PI/2, Math.sin(Math.PI/2)},
                {0, Math.sin(0.0)},
                {Math.PI, Math.sin(Math.PI)}
        };
    }
}
