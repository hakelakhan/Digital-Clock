import java.awt.*;

public class SecondsThread extends Thread {
    DigitalClockPanel digitalClockPanel;
    SecondsThread(DigitalClockPanel  c) {
        digitalClockPanel = c;
    }
    public void run() {
        int s ;
        while(true) {
            s = digitalClockPanel.getSecondsTB();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s++;
            if (s == 60)
                s = 0;
            digitalClockPanel.setSecondsTBTime(s);
        }
    }
}
