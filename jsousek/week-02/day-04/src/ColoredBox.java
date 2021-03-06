import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.RED);
        graphics.drawLine(10,10,100,10);

        graphics.setColor(Color.BLUE);
        graphics.drawLine(100,10,100,90);

        graphics.setColor(Color.magenta);
        graphics.drawLine(100,90,10,90);

        graphics.setColor(Color.CYAN);
        graphics.drawLine(10,90,10,10);






    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 360;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}