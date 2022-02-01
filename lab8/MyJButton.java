package lab8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyJButton extends JButton implements ActionListener {
    JPanel centerPanel;
    public MyJButton(int x, int y, int width, int height, String text, JPanel centerPanel) {//constructor
        setBounds(x, y, width, height);//setting the bound parameters
        setText(text);//setting the text parameters
        this.centerPanel = centerPanel;
        addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {//adding the action performed method
        if(e.getActionCommand().equalsIgnoreCase("Blue")){
            centerPanel.setBackground(Color.BLUE);
        }
        if(e.getActionCommand().equalsIgnoreCase("Red")){
            centerPanel.setBackground(Color.RED);
        }
    }
}

