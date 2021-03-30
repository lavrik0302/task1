package epam.jwd.task10.runner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.task10.printer.FunctionValuesPrinter;
import epam.jwd.task10.unit.TangentValuesLogics;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter value to compute from: ");
        double fromValue = DataScanner.enterDoubleFromConsole();
        System.out.print("Enter value to compute to: ");
        double toValue = DataScanner.enterDoubleFromConsole();
        System.out.print("Enter step: ");
        double step = DataScanner.enterPositiveDoubleFromConsole();

        var functionValues = TangentValuesLogics.computeFunctionValues(fromValue, toValue, step);
        FunctionValuesPrinter.printValuesOf(functionValues);
    }
}
