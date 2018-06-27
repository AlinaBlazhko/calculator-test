package testng.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

/**
 * Created by X240 on 6/26/2018.
 */
public class BaseTest {

    protected Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void before(){
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void after(){
        calculator = null;
    }
}
