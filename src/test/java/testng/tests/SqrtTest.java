package testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/26/2018.
 */
public class SqrtTest  extends BaseTest {
    @Test(dataProvider = "valuesForPow", groups = "arithmetic")
    public void sqrtTest(double a, double resulte){
        System.out.println("a = [" + a + "], resulte = [" + calculator.sqrt(a) + "]");
        Assert.assertTrue(calculator.sqrt(a) == resulte);
    }

    @DataProvider(name = "valuesForPow")
    public Object[][] valuesForPow(){
        return new Object[][]{
                {4.0, 2.0},
                {100.0, 10.0},
                {-900.0, 30.0},
                {0.25, 0.5}
        };
    }
}
