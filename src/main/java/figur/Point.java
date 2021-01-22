package figur;

import java.util.concurrent.ThreadLocalRandom;

public class Point {
    private final double X;
    private double Y;

    public Point() {
        X = setRandomCoordinate();
        Y = setRandomCoordinate();
    }

    public Point(double offsetX) {
        //offset to x coordinate
        X = setRandomCoordinate() + offsetX;
        Y = setRandomCoordinate();
    }

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    private double setRandomCoordinate() {
        double d = ThreadLocalRandom.current().nextDouble(0, 100);
        //round two signs after dot
        d = Math.round(d * 100.0) / 100.0;
        return d;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + X + ", y=" + Y + '}';
    }
}
