package junit.tests.tests;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

/**
 * Created by X240 on 6/27/2018.
 */
public class BaseTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @After
    public void after(){
        calculator = null;
    }
}
