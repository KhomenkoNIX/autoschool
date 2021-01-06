package figur;

public class Triangle extends Figure {

    private Point A;
    private Point B;
    private Point C;
    private String name;
    private double area;

    public Triangle() {
        A = new Point();
        B = new Point();
        C = new Point();
        name = setRandomName();
        calculateArea();

    }
    public Triangle(double offset) {
        A = new Point(offset);
        B = new Point(offset);
        C = new Point(offset);
        name = setRandomName();
        calculateArea();
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

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public Point[] getCoordinates() {
        Point[] points = new Point[]{A, B, C};
        return points;
    }

    @Override
    public void calculateArea() {
        //formula Geron: S = 1/2 * (x2-x1)*(y3-y1)-(x3-x1)(y2-y1)
        area = Math.abs(0.5 * ((B.getX() - A.getX()) * (C.getY() - A.getY()) - (C.getX() - A.getX()) * (B.getY() - A.getY())));
        // cut area to two signs after a dot
        area = roundTwoSigns(area);
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
