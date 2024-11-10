package B_Ampel;

public class Ampel implements Runnable {

    String ampelName;
    private int wait;
    Thread t;

    // AmpelZustände
    public static final int rot     = 1;
    public static final int rotGelb = 2;
    public static final int gelb    = 3;
    public static final int grün    = 4;

    private int Zustand = 1;

    //Konstruktor
    public Ampel(String ampelName, int speed) {
        this.ampelName = ampelName;
        this.wait = speed;
        t = new Thread(this);
    }

    @Override
    public void run() {
        while (true) {
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
                e.printStackTrace();
            }
        }
    }

    public void start() {
        t.start();
    }
}
