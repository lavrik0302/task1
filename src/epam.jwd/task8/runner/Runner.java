package epam.jwd.task8.runner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.function.NoFunctionValueException;
import epam.jwd.task8.unit.SomeFunction;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter x: ");
        double x = DataScanner.enterDoubleFromConsole();

        double valueOfFunction;
        try {
            valueOfFunction = SomeFunction.valueAt(x);
        } catch (NoFunctionValueException e) {
            valueOfFunction = Double.NaN;
        }
        System.out.printf("F(%f) = %f\n", x, valueOfFunction);
    }
}
