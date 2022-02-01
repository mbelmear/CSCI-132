package lab8;

import java.awt.Color;
import javax.swing.JPanel;

public class MyJPanel extends JPanel {
    public MyJPanel(int x, int y, int width, int height, Color color) {
        setBounds(x, y, width, height);
        setBackground(color);//setting the background to a color that will be called in the main
    }
}