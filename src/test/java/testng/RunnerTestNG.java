package testng;

import testng.listener.TestListeners;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by X240 on 6/24/2018.
 */
public class RunnerTestNG {
    public static void main(String[] args) {
        TestNG testNg = new TestNG();
        testNg.addListener(new TestListeners());
        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/test/resources/trigonometric.xml", "./src/test/resources/other.xml",
                "./src/test/resources/arithmetic.xml"));

        List<XmlSuite> suites = new ArrayList();
        suites.add(suite);

        testNg.setXmlSuites(suites);
        testNg.run();
    }
}
