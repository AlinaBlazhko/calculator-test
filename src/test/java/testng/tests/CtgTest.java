package testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/26/2018.
 */
public class CtgTest  extends BaseTest {
    @Test(dataProvider = "valuesForCos", groups = "trigonometric")
    public void ctgTest(double a, double result){
        System.out.println("Ctg(" + a  + "): " + calculator.ctg(a));
        Assert.assertTrue(calculator.ctg(a) == result);
    }

    @DataProvider(name = "valuesForCos")
    public Object[][] valuesForCos(){

        return new Object[][]{
                {Math.PI/4, 1.0},
                {0.0, 0.0},
                {Math.PI/2, 0.0}

        };
    }
}
