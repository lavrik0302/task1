package epam.jwd.task3.runner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.task3.unit.InnerOuterSquaresLogics;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter area of outer square: ");
        double outerSquareArea = DataScanner.enterPositiveDoubleFromConsole();

        double innerSquareArea = InnerOuterSquaresLogics.calculateInnerSquareAreaByOuterSquareArea(outerSquareArea);
        double difference = outerSquareArea / innerSquareArea;
        System.out.println("Area of inscribed square: " + innerSquareArea);
        System.out.printf("Area of given square is %f times greater than area of inscribed square.\n", difference);
    }
}
