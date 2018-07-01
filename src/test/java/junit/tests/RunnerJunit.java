package junit.tests;

import junit.tests.listener.Listener;
import junit.tests.tests.*;
import org.junit.runner.JUnitCore;

public class RunnerJunit {
    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();

        runner.addListener(new Listener());

        runner.run(CosTest.class, SinTest.class, CtgTest.class, TgTest.class,
                DivWithDoubleValuesTest.class, DivWithLongValuesTest.class,
                MultWithDoubleValuesTest.class, MultWithLongValuesTest.class,
                SubWithDoubleValuesTest.class, SubWithLongValuesTest.class,
                SumWithDoubleValuesTest.class, SumWithLongValuesTest.class,
                PowTest.class, SqrtTest.class);
    }

}
