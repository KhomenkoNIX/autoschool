package figur;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFiguresAreas {
    @Test
    public void testCircleArea(){
        System.out.println();
        Circle c = new Circle();
        c.setA(new Point(0,0));
        c.setB(new Point(2,0));
        c.calculateArea();
        Assert.assertEquals(c.getArea(),12.57);
    }
    @Test
    public void testSquareArea(){
        Square square = new Square();
        square.setA(new Point(0,0));
        square.setC(new Point(2,0));
        square.calculateSquareTwoPoints(square.getA(), square.getC());
        square.calculateArea();
        Assert.assertEquals(square.getArea(),2.0);
    }

    @Test
    public void testTriangleArea(){
        Triangle triangle = new Triangle();
        triangle.setA(new Point(0,0));
        triangle.setB(new Point(3,0));
        triangle.setC(new Point(0,4));
        triangle.calculateArea();
        Assert.assertEquals(triangle.getArea(),6.0);
    }

}