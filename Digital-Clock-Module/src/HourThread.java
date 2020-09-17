public class HourThread extends Thread {
    DigitalClockPanel digitalClockPanel;
    HourThread(DigitalClockPanel  c) {
        digitalClockPanel = c;
    }
    public void run() {
        int s;
        while(true) {
            s = digitalClockPanel.getHourTBTime();

            try {
                Thread.sleep(1000 * 60 * 60);   //Increment after an hour
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s++;
            if (s == 24)
                s = 0;
            digitalClockPanel.setHourTBTime(s);
        }
    }
}
