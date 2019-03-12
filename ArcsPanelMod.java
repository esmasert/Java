package deneme;

import javax.swing.*;
import java.awt.*;

public class ArcsPanelMod extends JPanel{
    int a = 0;
    int speed = 1;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
        int x = xCenter - radius;
        int y = yCenter - radius;

        g.fillArc(x, y, 2 * radius, 2 * radius, a % 360, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, (a + 90) % 360, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, (a + 180) % 360, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, (a + 270) % 360, 30);
        a += speed;
    }
}