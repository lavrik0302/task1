package epam.jwd.function;

public interface Function {

    double valueAt(double x) throws NoFunctionValueException;
}
