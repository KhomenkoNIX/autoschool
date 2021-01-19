package figur;

public class Triangle extends Figure {

    private Point a;
    private Point b;
    private Point c;
    private String name;
    private double area;

    public Triangle() {
        a = new Point();
        b = new Point();
        c = new Point();
        name = setRandomName();
        calculateArea();
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        name = setRandomName();
        calculateArea();
    }

    public Triangle(double offset) {
        a = new Point(offset);
        b = new Point(offset);
        c = new Point(offset);
        name = setRandomName();
        this.area = calculateArea();
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

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public Point[] getCoordinates() {
        Point[] points = new Point[]{a, b, c};
        return points;
    }

    private double calculateArea() {
        //formula Geron: S = 1/2 * (x2-x1)*(y3-y1)-(x3-x1)(y2-y1)
        area = Math.abs(0.5 * ((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY())));
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
        return "Triangle {name: " + name + ", area = " + area + '}';
    }
}
