package figur;

public class Square extends Figure {

    private Point A;
    private Point B;
    private Point C;
    private Point D;
    private String name;
    private double area;

    public double getArea() {
        return area;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public Point getD() {
        return D;
    }

    public void setA(Point a) {
        A = a;
    }
    public void setC(Point c) {
        C = c;
    }

    public Square() {
        //set random diagonal points of square
        A = new Point();
        C = new Point();
        calculateSquareTwoPoints(A, C);
        name = setRandomName();
        calculateArea();
    }

    //constructor with offset - not to cross figures

    public Square(double offset) {
        //set random diagonal points of square
        A = new Point(offset);
        C = new Point(offset);
        calculateSquareTwoPoints(A, C);
        name = setRandomName();
        calculateArea();
    }

    public void calculateSquareTwoPoints(Point A, Point C) {
        // calculate center point of crossing diagonal
        double x0 = (A.getX() + C.getX()) / 2;
        double y0 = (A.getY() + C.getY()) / 2;
        //calculate vector of the point
        double xVector = A.getX() - x0;
        double yVector = A.getY() - y0;
        // Point B coordinates:
        double xB = x0 - yVector;
        double yB = y0 + xVector;
        B = new Point(xB, yB);
        double xD = x0 + yVector;
        double yD = y0 - xVector;
        D = new Point(xD, yD);
    }

    @Override
    public Point[] getCoordinates() {
        Point[] points = new Point[]{A, B, C, D};
        return points;
    }


    public void calculateArea() {
        //formula: side AB = √(xb - xa)pow2 + (yb - ya)pow2
        double sideAB = Math.sqrt(Math.pow((A.getX() - B.getX()), 2) + Math.pow((A.getY() - B.getY()), 2));
        area = sideAB * sideAB;
        // cut area to two signs after a dot
        area = roundTwoSigns(area);
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
