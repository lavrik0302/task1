package epam.jwd.task7.unit;

public class PointLogics {

    public static Point nearestToZero(Point pointA, Point pointB) {
        if (pointA == null || pointB == null) {
            throw new IllegalArgumentException("Point cannot be null.");
        }
        Point zero = new Point(0, 0);
        double distanceA = calculateDistanceBetween(pointA, zero);
        double distanceB = calculateDistanceBetween(pointB, zero);

        Point nearestToZero;
        if (distanceA < distanceB) {
            nearestToZero = pointA;
        } else {
            nearestToZero = pointB;
        }
        return nearestToZero;
    }

    public static double calculateDistanceBetween(Point pointA, Point pointB) {
        double vectorX = pointB.getX() - pointA.getX();
        double vectorY = pointB.getY() - pointA.getY();
        double distance = Math.sqrt(vectorX * vectorX + vectorY * vectorY);
        return distance;
    }
}
