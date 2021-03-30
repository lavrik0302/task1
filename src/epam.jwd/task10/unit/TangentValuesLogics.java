package epam.jwd.task10.unit;

import epam.jwd.function.Function;
import epam.jwd.function.NoFunctionValueException;

import java.util.LinkedHashMap;
import java.util.Map;

public class TangentValuesLogics {

    private static final Function tanFunction = Math::tan;

    public static Map<Double, Double> computeFunctionValues(double fromValue, double toValue, double step) {
        if (toValue < fromValue) {
            throw new IllegalArgumentException("Invalid interval.");
        }
        if (step <= 0) {
            throw new IllegalArgumentException("Step must be positive.");
        }
        Map<Double, Double> functionValues = new LinkedHashMap<>();
        for (double x = fromValue; x < toValue; x += step) {
            double functionValue = tan(x);
            functionValues.put(x, functionValue);
        }
        return functionValues;
    }

    public static double tan(double x) {
        double tanValue;
        try {
            tanValue = tanFunction.valueAt(x);
        } catch (NoFunctionValueException e) {
            tanValue = Double.NaN;
        }
        return tanValue;
    }
}
