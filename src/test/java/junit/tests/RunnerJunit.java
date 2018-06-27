package junit.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
//@RunWith(Suite.class)
//@SuiteClasses({
//        SumTest.class,
//        SubTest.class,
//        })
public class RunnerJunit {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SimpleTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
