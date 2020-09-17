import javax.swing.*;
import java.awt.*;

public class MainClass {
    public static void main(String[] args) {


        JFrame frame = new JFrame ("Digital Clock");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        DigitalClockPanel digitalClockPanel = new DigitalClockPanel();
        frame.getContentPane().add (digitalClockPanel);
        frame.pack();
        frame.setVisible (true);
        digitalClockPanel.setSecondsTBTime(0);
        digitalClockPanel.setMinTBTime(0);
        digitalClockPanel.setHourTBTime(0);
        SecondsThread s = new SecondsThread(digitalClockPanel);
        Thread m = new Thread(new MinsThread(digitalClockPanel));
        HourThread h = new HourThread(digitalClockPanel);
        s.start();
        m.start();
        h.start();
        System.out.println("Hello");
    }
}
