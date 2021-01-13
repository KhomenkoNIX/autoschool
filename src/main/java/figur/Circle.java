package figur;

public class Circle extends Figure {

    private Point a;
    private Point b;
    private String name;
    private double area;

    public Circle() {
        a = new Point();
        b = new Point();
        name = setRandomName();
        calculateArea();
    }

    //constructor with offset - not to cross figures
    public Circle(double offset) {
        a = new Point(offset);
        b = new Point(offset);
        name = setRandomName();
        calculateArea();
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    // sorry for this crutch -it needed to draw figures(Liskov substitution principle I should have learned earlier)
    public Point getC() {
        System.out.println("There is no C point in Circle.  so returned null");
        return null;
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

    public double calculateArea() {
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
