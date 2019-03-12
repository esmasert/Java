package deneme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class DrawArcs extends JFrame implements ActionListener {

    JButton Bslow = new JButton("Slow");
    JButton Bmedium = new JButton("Medium");
    JButton Bfast = new JButton("Fast");
    private Fan arcsPanel;

    public DrawArcs() {

        setTitle("DrawArcs");

        arcsPanel = new Fan();

        // this timer is called in every 20ms
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                arcsPanel.repaint();
            }
        }, 20, 20);

        arcsPanel.setPreferredSize(new Dimension(250,230));

        JPanel panel = new JPanel();
        panel.add(arcsPanel);
        panel.add(Bslow);
        panel.add(Bmedium);
        panel.add(Bfast);
        add(panel);

        Bslow.addActionListener(this);
        Bmedium.addActionListener(this);
        Bfast.addActionListener(this);

    }

    /** Main method */
    public static void main(String[] args) {

        DrawArcs frame = new DrawArcs();

        frame.setLocation(550,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }


    public void actionPerformed(ActionEvent evt) {

        Object src = evt.getSource();

        if (src == Bslow) {
            arcsPanel.speed = 1;
        }
        else if(src==Bmedium){
            arcsPanel.speed = 5;
        }
        else if(src==Bfast){
            arcsPanel.speed = 10;
        }
    }
}


class Fan extends JPanel {

    int a = 0;
    int speed = 1;

    // drawing arcs on a panel
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

        int x = xCenter - radius;
        int y = yCenter - radius;

        g.fillArc(x, y, 2 * radius, 2 * radius, a % 360, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, (a + 90) % 360, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, (a + 180) % 360, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, (a + 270) % 360, 30);
        a += speed;

    }
}