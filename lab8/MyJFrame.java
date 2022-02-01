package lab8;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
    public MyJFrame(int height, int width, String text) {
        super(text);//calling the super with a string
        setSize(500, 500);//setting the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//making the program stop running when the user exits the window
    }
}
