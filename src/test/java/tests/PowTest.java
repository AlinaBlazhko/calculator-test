package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/26/2018.
 */
public class PowTest extends BaseTest{
    @Test(groups = "arithmetic")
    public void twoPow2(){
        Assert.assertTrue(calculator.pow(2, 2) == 4);
    }
}
