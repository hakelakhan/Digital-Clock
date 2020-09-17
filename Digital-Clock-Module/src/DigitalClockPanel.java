import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DigitalClockPanel extends JPanel {
    private JButton jcomp1;
    private JTextArea hourTB;
    private JTextArea minTB;
    private JTextArea secondsTB;
    private JLabel jcomp5;
    private JLabel jcomp6;

    public DigitalClockPanel() {
        //construct components
        jcomp1 = new JButton ("Button 1");
        hourTB = new JTextArea (5, 5);
        minTB = new JTextArea (5, 5);
        secondsTB = new JTextArea (5, 5);
        jcomp5 = new JLabel (":");
        jcomp6 = new JLabel (":");

        //adjust size and set layout
        setPreferredSize (new Dimension (548, 172));
        setLayout (null);

        hourTB.setEditable(false);
        minTB.setEditable(false);
        secondsTB.setEditable(false);

        //add components
        add (jcomp1);
        add (hourTB);
        add (minTB);
        add (secondsTB);
        add (jcomp5);
        add (jcomp6);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (-195, 95, 100, 20);
        hourTB.setBounds (60, 65, 85, 50);
        minTB.setBounds (220, 65, 85, 50);
        secondsTB.setBounds (375, 65, 85, 50);
        jcomp5.setBounds (175, 75, 10, 25);
        jcomp6.setBounds (335, 75, 10, 25);
    }

    public void setHourTBTime(int hour) {
        hourTB.setText(String.valueOf(hour));
    }
    public void setSecondsTBTime(int seconds) {
        secondsTB.setText(String.valueOf(seconds));
    }
    public int getHourTBTime() {
        return Integer.parseInt(hourTB.getText());
    }
    public int getMinTBTime() {
        return Integer.parseInt(minTB.getText());
    }
    public void setMinTBTime(int mins) {
        minTB.setText(String.valueOf(mins));
    }
    public  int getSecondsTB() {
        return Integer.parseInt(secondsTB.getText());
    }

}
