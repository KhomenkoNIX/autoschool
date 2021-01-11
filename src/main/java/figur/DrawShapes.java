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

    public JButton createButtonRefresh() {

        JButton button = new JButton("REFRESH");
        java.awt.event.ActionListener actionListener = new ActionListener();
        button.setBounds(950, 450, 140, 40);
        button.addActionListener(actionListener);
        return button;
    }

    public DrawShapes(Figure[] arr) {

        setSize(new Dimension(1980, 620));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("My random Figures");
        drawFiguresFromArray(arr);
    }

    public void drawFiguresFromArray(Figure[] figures) {
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

    public Shape createCircleShape(Figure c) {
        double diameter = 2 * Math.sqrt(Math.pow((c.getA().getX() - c.getB().getX()), 2) + Math.pow((c.getA().getY() - c.getB().getY()), 2));
        Shape circle = new Ellipse2D.Double(c.getA().getX(), c.getA().getY(), diameter, diameter);
        return circle;
    }

    public Shape createSquareShape(Figure c) {
        double sideAB = Math.sqrt(Math.pow((c.getA().getX() - c.getB().getX()), 2) + Math.pow((c.getA().getY() - c.getB().getY()), 2));
        Shape square = new Rectangle2D.Double(c.getA().getX(), c.getA().getY(), sideAB, sideAB);
        return square;
    }

    public Shape createTriangleShape(Figure c) {
        int[] pointsX = new int[]{(int) c.getA().getX(), (int) c.getB().getX(), (int) c.getC().getX()};
        int[] pointsY = new int[]{(int) c.getA().getY(), (int) c.getB().getY(), (int) c.getC().getY()};
        Polygon poly = new Polygon(pointsX, pointsY, 3);
        return poly;
    }

    public void createLabel(Figure f) {
        JLabel label1 = new JLabel(f.getName());
        label1.setBounds((int) f.getA().getX(), 320, 140, 20);
        p.add(label1);
        JLabel label2 = new JLabel("S = " + f.getArea());
        label2.setBounds((int) f.getA().getX(), 335, 140, 20);
        p.add(label2);

    }

}



class ActionListener implements java.awt.event.ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Main m = new Main();
        m.startDrawApp(m.createFiguresArray(10, 0));
    }
}



