package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/26/2018.
 */
public class PowTest extends BaseTest{
    @Test(dataProvider = "valuesForPow", groups = "arithmetic")
    public void twoPow2(double a, double b, double resulte){
        System.out.println("a = [" + a + "], b = [" + b + "], resulte = [" + calculator.pow(a, b) + "]");
        Assert.assertTrue(calculator.pow(a, b) == resulte);
    }

    @DataProvider(name = "valuesForPow")
    public Object[][] valuesForPow(){
        return new Object[][]{
                {2.0, 2.0, 4.0},
                {10.0, 0.0, 1.0},
                {100.0, -1.0, 0.01}
        };
    }
}
