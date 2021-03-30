package epam.jwd.task7.runner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.task7.unit.Point;
import epam.jwd.task7.unit.PointLogics;

public class Runner {

    public static void main(String[] args) {
        double x;
        double y;
        System.out.print("Enter x for point A: ");
        x = DataScanner.enterDoubleFromConsole();
        System.out.print("Enter y for point A: ");
        y = DataScanner.enterDoubleFromConsole();
        Point pointA = new Point(x, y);

        System.out.print("Enter x for point B: ");
        x = DataScanner.enterDoubleFromConsole();
        System.out.print("Enter y for point B: ");
        y = DataScanner.enterDoubleFromConsole();
        Point pointB = new Point(x, y);

        Point nearestToZero = PointLogics.nearestToZero(pointA, pointB);
        System.out.printf("Nearest point is %s: %s\n", nearestToZero == pointA ? "A" : "B", nearestToZero);
    }
}
