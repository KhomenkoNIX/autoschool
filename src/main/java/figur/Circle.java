package figur;

public class Circle extends Figure {

    private Point a;
    private Point b;
    private String name;
    private double area;

    // constructor with random Points
    public Circle() {
        a = new Point();
        b = new Point();
        name = setRandomName();
        calculateArea();
    }

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
        name = setRandomName();
        calculateArea();
    }

    //constructor with offset - not to cross figures
    public Circle(double offset) {
        a = new Point(offset);
        b = new Point(offset);
        name = setRandomName();
        area = calculateArea();
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public double getArea() {
        return area;
    }

    @Override
    public Point[] getCoordinates() {
        Point[] points = new Point[]{a, b};
        return points;
    }

    private double calculateArea() {
        //formula S = Pi * r * r;
        //formula: radius = √(xb - xa)pow2 + (yb - ya)pow2
        double radius = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
        area = Math.PI * radius * radius;
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
