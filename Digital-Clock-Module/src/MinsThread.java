public class MinsThread implements Runnable {
    DigitalClockPanel digitalClockPanel;
    MinsThread(DigitalClockPanel  c) {
        digitalClockPanel = c;
    }
    public void run() {
        int s ;
        while(true) {
            s = digitalClockPanel.getMinTBTime();
            try {
                Thread.sleep(1000 * 60 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s++;
            if (s == 60)
                s = 0;
            digitalClockPanel.setMinTBTime(s);
        }
    }
}
