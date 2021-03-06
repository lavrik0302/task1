package epam.jwd.task3.unit;

public class InscribedShapesLogics {

    public static double calculateSideLengthOfSquareInscribedInCircle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        double squareSideLength = radius * Math.sqrt(2);
        return squareSideLength;
    }

    public static double calculateRadiusOfCircleInscribedInSquare(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Square's side length must be positive.");
        }
        double radius = sideLength / 2;
        return radius;
    }
}
