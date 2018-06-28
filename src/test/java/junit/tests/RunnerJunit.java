package junit.tests;

import com.beust.jcommander.Parameter;
import junit.tests.listener.Listener;
import junit.tests.tests.SubLongTest;
import junit.tests.tests.SubWithDoubleValuesTest;
import junit.tests.tests.SumWithDoubleValuesTest;
import junit.tests.tests.SumWithLongValuesTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import testng.tests.SubDoubleTest;
import testng.tests.SumDoubleTest;
import testng.tests.SumLongTest;

import javax.swing.*;

public class RunnerJunit {

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();

        runner.addListener(new Listener());

        runner.run(SumWithDoubleValuesTest.class, SumWithLongValuesTest.class, SubWithDoubleValuesTest.class);
    }

}
