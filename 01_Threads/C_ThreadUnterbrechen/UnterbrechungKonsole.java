package C_ThreadUnterbrechen;

public class UnterbrechungKonsole implements Runnable {
    
    String ampelName;
    String eingabe;
    private int wait;
    Thread t;

    // AmpelZustände
    public static final int rot     = 1;
    public static final int rotGelb = 2;
    public static final int gelb    = 3;
    public static final int grün    = 4;

    private int Zustand = 1;

    public UnterbrechungKonsole (String ampelName, int speed) {
        this.ampelName = ampelName;
        this.wait = speed;
        t = new Thread(this);
    }

    @Override
    public void run() {
        while (true) {
            if (isInterrupted()== true) {
                break;
            }
            switch (Zustand) {
                case rot:
                    System.out.println("Ampel rot");
                    Zustand = rotGelb;
                    break;

                case rotGelb:
                    System.out.println("Ampel Rot-Gelb");
                    Zustand = grün;
                    break;

                case gelb:
                    System.out.println("Ampel Gelb");
                    Zustand = rot;
                    break;

                case grün:
                    System.out.println("Ampel Grün");
                    Zustand = gelb;
            }

            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                stoppen();
            }
        }
    }

    private boolean isInterrupted() {
        return t.isInterrupted();
    }

    public void start() {
        t.start();
    }

    public void stoppen() {
        t.interrupt();
    }
}
