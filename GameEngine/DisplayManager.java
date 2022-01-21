package GameEngine;

import javax.swing.*;

public class DisplayManager extends GameEngine {

    JFrame frame;
    JPanel panel;

    public void createWindow(int x, int y, int frameCloseOperation) {

        frame = new JFrame();
        panel = new JPanel(null);

        panel.setSize(x, y);
        frame.setSize(x, y);

        pixels = new JButton[x][y];

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                JButton pixel = pixels[i][j];

                pixel = new JButton();
                pixel.setBounds(x, y, 1, 1);
                panel.add(pixel);


            }

        }

        frame.add(panel);

        frame.setDefaultCloseOperation(frameCloseOperation);

        panel.setVisible(true);
        frame.setVisible(true);

    }

}
