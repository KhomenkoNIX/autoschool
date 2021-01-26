package figur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DrawShapes extends JFrame {

    JPanel p;

    public DrawShapes(Figure[] arr) {

        setSize(new Dimension(1980, 620));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("My random Figures");
        drawFiguresFromArray(arr);
    }

    private void drawFiguresFromArray(Figure[] figures) {
        p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                //draw the refresh button
                p.add(createButtonRefresh());

                //draw the line
                g2.drawLine(0, 300, 2100, 300);

                //Parse Array to figure's instance and print it:
                for (Figure f : figures) {

                    switch (f.getClass().getSimpleName()) {
                        case "Circle": {
                            g2.setColor(Color.YELLOW);
                            g2.fill(createCircleShape(f));
                            // write the name and area
                            createLabel(f);
                            break;
                        }
                        case "Square": {
                            g2.setColor(Color.GREEN);
                            g2.fill(createSquareShape(f));
                            // write the name and area
                            createLabel(f);
                            break;
                        }
                        case "Triangle": {
                            g2.setColor(Color.RED);
                            g2.fill(createTriangleShape(f));
                            // write the name and area
                            createLabel(f);
                            break;
                        }
                    }
                }
            }
        };

        this.getContentPane().add(p);
    }

    public JButton createButtonRefresh() {

        JButton button = new JButton("REFRESH");
        java.awt.event.ActionListener actionListener = new ActionListener();
        button.setBounds(950, 450, 140, 40);
        button.addActionListener(actionListener);
        return button;
    }

    public Shape createCircleShape(Figure c) {
        double ax = 0;
        double bx = 0;
        double ay = 0;
        double by = 0;
        Point[] point = c.getCoordinates();
        for (int i = 0; i < point.length; i++) {
            switch (i) {
                case 0: {
                    ax = point[i].getX();
                    ay = point[i].getY();
                    break;
                }
                case 1: {
                    bx = point[i].getX();
                    by = point[i].getY();
                    break;
                }
            }
        }
        double diameter;
        diameter = 2 * Math.sqrt((Math.pow((ax - bx), 2)) + Math.pow((ay - by), 2));
        Shape circle = new Ellipse2D.Double(ax, ay, diameter, diameter);
        return circle;
    }

    public Shape createSquareShape(Figure s) {
        double ax = 0;
        double bx = 0;
        double ay = 0;
        double by = 0;
        Point[] point = s.getCoordinates();
        for (int i = 0; i < point.length; i++) {
            switch (i) {
                case 0: {
                    ax = point[i].getX();
                    ay = point[i].getY();
                    break;
                }
                case 1: {
                    bx = point[i].getX();
                    by = point[i].getY();
                    break;
                }
            }
        }
        double sideAB = Math.sqrt((Math.pow((ax - bx), 2)) + Math.pow((ay - by), 2));
        Shape square = new Rectangle2D.Double(ax, ay, sideAB, sideAB);
        return square;
    }

    public Shape createTriangleShape(Figure s) {
        double ax = 0;
        double bx = 0;
        double ay = 0;
        double by = 0;
        double cx = 0;
        double cy = 0;
        Point[] point = s.getCoordinates();
        for (int i = 0; i < point.length; i++) {
            switch (i) {
                case 0: {
                    ax = point[i].getX();
                    ay = point[i].getY();
                    break;
                }
                case 1: {
                    bx = point[i].getX();
                    by = point[i].getY();
                    break;
                }
                case 2: {
                    cx = point[i].getX();
                    cy = point[i].getY();
                    break;
                }
            }
        }
        int[] pointsX = new int[]{(int) ax, (int) bx, (int) cx};
        int[] pointsY = new int[]{(int) ay, (int) by, (int) cy};
        Polygon poly = new Polygon(pointsX, pointsY, 3);
        return poly;
    }


    public void createLabel(Figure f) {
        JLabel label1 = new JLabel(f.getName());
        Point[] points = f.getCoordinates();

        label1.setBounds((int) points[0].getX(), 320, 140, 20);
        p.add(label1);
        JLabel label2 = new JLabel("S = " + f.getArea());
        label2.setBounds((int) points[0].getX(), 335, 140, 20);
        p.add(label2);

    }

}


class ActionListener implements java.awt.event.ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Main m = new Main();
        //m.updateUI();
        m.startDrawApp(m.createFiguresArray(10, 0));
    }
}



