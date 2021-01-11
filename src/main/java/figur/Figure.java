package figur;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Figure {

    public abstract void calculateArea();

    public abstract String getName();

    public abstract double getArea();

    public abstract Point[] getCoordinates();

    public abstract Point getA();
    public abstract Point getB();
    public abstract Point getC();


    public void showCoordinates() {
        Point[] points = this.getCoordinates();
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i].toString());
        }
    }

    public double roundTwoSigns(double d) {
        // cut double to two signs after a dot
        d = Math.round(d * 100.0) / 100.0;
        return d;
    }

    public String setRandomName() {
        String[] list = new String[]{"Pavel", "Antonio", "Hose", "Igor", "Dimon", "Ernesto", "Semen", "Edward", "Serega", "Koljan"};
        int i = ThreadLocalRandom.current().nextInt(0, 10);
        return list[i];
    }
}
