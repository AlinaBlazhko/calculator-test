package testng.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

/**
 * Created by X240 on 6/24/2018.
 */
public class TestListeners implements ITestListener {

    public void onTestStart(ITestResult result) {
//        System.out.println("on Test Start: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
//        System.out.println("on Test Success: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Failed " + result.getName() + " "+ Arrays.toString(result.getParameters()));

    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }

}
