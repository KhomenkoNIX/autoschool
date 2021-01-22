package figur;

public class Circle extends Figure {

    private final Point A;
    private final Point B;
    private final String name;
    private final double area;

    // constructor with random Points
    public Circle() {
        A = new Point();
        B = new Point();
        name = super.setRandomName();
        area = calculateArea();
    }

    public Circle(Point a, Point b) {
        this.A = a;
        this.B = b;
        name = super.setRandomName();
        area = calculateArea();
    }

    //constructor with offset - not to cross figures
    public Circle(double offset) {
        A = new Point(offset);
        B = new Point(offset);
        name = super.setRandomName();
        area = calculateArea();
    }

    public double getArea() {
        return area;
    }

    @Override
    public Point[] getCoordinates() {
        Point[] points = new Point[]{A, B};
        return points;
    }

    private double calculateArea() {
        //formula S = Pi * r * r;
        //formula: radius = √(xb - xa)pow2 + (yb - ya)pow2
        double radius = Math.sqrt(Math.pow((A.getX() - B.getX()), 2) + Math.pow((A.getY() - B.getY()), 2));
        double area = Math.PI * radius * radius;
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
        return "Circle {name: " + name + ", area = " + area + '}';
    }
}
