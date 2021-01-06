package figur;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Point {
    private double x;
    private double y;

    public Point() {
        x = setRandomCoordinate();
        y = setRandomCoordinate();
    }

    public Point(double offsetX) {
        //offset to x coordinate
        x = setRandomCoordinate() + offsetX;
        y = setRandomCoordinate();
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double setRandomCoordinate() {
        double d = ThreadLocalRandom.current().nextDouble(0, 100);
        //round two signs after dot
        d = Math.round(d * 100.0) / 100.0;
        return d;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
