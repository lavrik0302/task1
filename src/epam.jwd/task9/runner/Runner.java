package epam.jwd.task9.runner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.task9.unit.CircleLogics;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        double radius = DataScanner.enterPositiveDoubleFromConsole();

        double perimeter = CircleLogics.calculatePerimeterByRadius(radius);
        double area = CircleLogics.calculateAreaByRadius(radius);

        System.out.println("Circle perimeter: " + perimeter);
        System.out.println("Circle area: " + area);
    }
}
