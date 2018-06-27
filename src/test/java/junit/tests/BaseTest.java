package junit.tests;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by X240 on 6/27/2018.
 */
public class BaseTest {
    Calculator calculator;

    @BeforeEach
    public void before(){
        calculator = new Calculator();
    }

    @AfterEach
    public void after(){
        calculator = null;
    }
}
