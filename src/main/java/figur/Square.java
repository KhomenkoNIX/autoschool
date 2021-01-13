package figur;

public class Square extends Figure {

    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private String name;
    private double area;

    public Square() {
        //set random diagonal points of square
        a = new Point();
        c = new Point();
        calculateSquareTwoPoints(a, c);
        name = setRandomName();
        calculateArea();
    }

    //constructor with offset - not to cross figures

    public Square(double offset) {
        //set random diagonal points of square
        a = new Point(offset);
        c = new Point(offset);
        calculateSquareTwoPoints(a, c);
        name = setRandomName();
        this.area = calculateArea();
        ;
    }

    public double getArea() {
        return area;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setC(Point c) {
        this.c = c;
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
        b = new Point(xB, yB);
        double xD = x0 + yVector;
        double yD = y0 - xVector;
        d = new Point(xD, yD);
    }

    @Override
    public Point[] getCoordinates() {
        Point[] points = new Point[]{a, b, c, d};
        return points;
    }

    public double calculateArea() {
        //formula: side AB = √(xb - xa)pow2 + (yb - ya)pow2
        double sideAB = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
        area = sideAB * sideAB;
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
