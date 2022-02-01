package lab8;

import java.awt.BorderLayout;
import java.awt.Color;

public class MyFrame{
    public static void main(String[] args) {
        MyJFrame frame = new MyJFrame(500, 500, "MyFrame");//setting the width of the entire frame/window
        MyJPanel buttonPanel = new MyJPanel(0, 0, 200, 500, Color.YELLOW);//setting the west panel size color to yellow
        MyJPanel colorPanel = new MyJPanel(0, 0, 300, 500, Color.BLACK);//setting the center panel size and color to black
        MyJButton blueButton = new MyJButton(5, 0, 80, 25, "Blue", colorPanel);//setting the blue button title and size
        MyJButton blackButton = new MyJButton(90, 0, 80, 25, "Red", colorPanel);//setting the red button title and size
        buttonPanel.add(blueButton);//calling the blue button action method
        buttonPanel.add(blackButton);//calling the red button action method
        frame.add(buttonPanel,BorderLayout.WEST);//adding the west frame
        frame.add(colorPanel, BorderLayout.CENTER);//adding the center frame
        frame.setVisible(true);//making the frame visible to the user
    }
}
