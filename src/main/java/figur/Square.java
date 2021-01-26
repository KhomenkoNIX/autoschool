package figur;

import java.util.HashMap;
import java.util.Map;

public class Square extends Figure {

    private final Point A;
    private final Point B;
    private final Point C;
    private final Point D;
    private final String name;
    private final double area;

    public Square() {
        //set random diagonal points of square
        A = new Point();
        C = new Point();
        B = new Point(calculateBPointCoordinate(A, C));
        D = new Point(calculateBPointCoordinate(A, C));
        name = super.setRandomName();
        area = calculateArea();
    }

    public Square(Point a, Point c) {
        //set  diagonal points of square
        this.A = a;
        this.C = c;
        B = new Point(calculateBPointCoordinate(A, C));
        D = new Point(calculateBPointCoordinate(A, C));
        name = super.setRandomName();
        area = calculateArea();
    }
    //constructor with offset - not to cross figures

    public Square(double offset) {
        //set random diagonal points of square
        A = new Point(offset);
        C = new Point(offset);
        B = new Point(calculateBPointCoordinate(A, C));
        D = new Point(calculateBPointCoordinate(A, C));
        name = setRandomName();
        this.area = calculateArea();

    }

    public double getArea() {
        return area;
    }

    /*private Map<String, Double> calculateSquareCoordinatesBPointAndD(Point a, Point c) {
        //creating collection of coordinates for B and D points.
        Map<String, Double> coordinatesBAndD = new HashMap<String, Double>();
        // calculate center point of crossing diagonal
        double x0 = (a.getX() + c.getX()) / 2;
        double y0 = (a.getY() + c.getY()) / 2;
        //calculate vector of the point
        double xVector = a.getX() - x0;
        double yVector = a.getY() - y0;
        // Point B coordinates:
        double xB = x0 - yVector;
        double yB = y0 + xVector;
        coordinatesBAndD.put("xB", xB);
        coordinatesBAndD.put("yB", yB);
        // Point D coordinates:
        double xD = x0 + yVector;
        double yD = y0 - xVector;
        coordinatesBAndD.put("xD", xD);
        coordinatesBAndD.put("yD", yD);
        return coordinatesBAndD;
    } */
    private double[] calculateBPointCoordinate(Point a, Point c) {

        // calculate center point of crossing diagonal
        double x0 = (a.getX() + c.getX()) / 2;
        double y0 = (a.getY() + c.getY()) / 2;
        //calculate vector of the point
        double xVector = a.getX() - x0;
        double yVector = a.getY() - y0;
        // Point B coordinates:
        double xB = x0 - yVector;
        double yB = y0 + xVector;
        double[] coordinatesB = new double[]{xB, yB};
        return coordinatesB;
    }

    private double[] calculateDPointCoordinates(Point a, Point c) {
        // calculate center point of crossing diagonal
        double x0 = (a.getX() + c.getX()) / 2;
        double y0 = (a.getY() + c.getY()) / 2;
        //calculate vector of the point
        double xVector = a.getX() - x0;
        double yVector = a.getY() - y0;
        ;
        // Point D coordinates:
        double xD = x0 + yVector;
        double yD = y0 - xVector;
        double[] coordinatesD = new double[]{xD, yD};
        return coordinatesD;
    }

    @Override
    public Point[] getCoordinates() {
        Point[] points = new Point[]{A, B, C, D};
        return points;
    }

    //@Override
    private double calculateArea() {
        //formula: side AB = √(xb - xa)pow2 + (yb - ya)pow2
        double sideAB = Math.sqrt(Math.pow((A.getX() - B.getX()), 2) + Math.pow((A.getY() - B.getY()), 2));
        double area = sideAB * sideAB;
        // cut area to two signs after a dot
        area = roundTwoSigns(area);
        return area;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Square {name: " + name + ", area = " + area + '}';
    }
}
