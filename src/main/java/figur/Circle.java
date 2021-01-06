package figur;

public class Circle extends Figure {

    private Point A;
    private Point B;
    private String name;
    private double area;

    public Circle() {
        A = new Point();
        B = new Point();
        name = setRandomName();
        calculateArea();
    }

    //constructor with offset - not to cross figures
    public Circle(double offset) {
        A = new Point(offset);
        B = new Point(offset);
        name = setRandomName();
        calculateArea();
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public double getArea() {
        return area;
    }

    @Override
    public Point[] getCoordinates() {
        Point[] points = new Point[]{A, B};
        return points;
    }

    @Override
    public void calculateArea() {
        //formula S = Pi * r * r;
        //formula: radius = √(xb - xa)pow2 + (yb - ya)pow2
        double radius = Math.sqrt(Math.pow((A.getX() - B.getX()), 2) + Math.pow((A.getY() - B.getY()), 2));
        area = Math.PI * radius * radius;
        // cut area to two signs after a dot
        area = roundTwoSigns(area);
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
