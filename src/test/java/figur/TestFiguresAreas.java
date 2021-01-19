package figur;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFiguresAreas {
    @Test
    public void testCircleArea() {
        System.out.println();
        Circle c = new Circle(new Point(0, 0), new Point(2, 0));
        Assert.assertEquals(c.getArea(), 12.57);
    }

    @Test
    public void testSquareArea() {
        Square square = new Square(new Point(0, 0), new Point(2, 0));
        Assert.assertEquals(square.getArea(), 2.0);
    }

    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
        Assert.assertEquals(triangle.getArea(), 6.0);
    }

}