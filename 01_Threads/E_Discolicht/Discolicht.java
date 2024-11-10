package E_Discolicht;

public class Discolicht implements Runnable {

    private String lichtName;
    private int wait;
    private Thread t;

    // LichtZustände
    public static final int rot     = 1;
    public static final int pink    = 2;
    public static final int gelb    = 3;
    public static final int blau    = 4;
    
    private int Zustand = pink;

    // Konstruktor
    public Discolicht(String lichtName, int wait) {
        this.lichtName = lichtName;
        this.wait = wait;

        t = new Thread(this);
    }
    
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted() == true) {
                break;
            }

            switch (Zustand) {
                case rot:
                    System.out.println(lichtName + ": -- Rot  --");
                    Zustand = pink;

                case pink:
                    System.out.println(lichtName + ": -- Pink --");
                    Zustand = gelb;
                    break;

                case gelb:
                    System.out.println(lichtName + ": -- Gelb --");
                    Zustand = blau;
                    break;
                    

                case blau:
                    System.out.println(lichtName + ": -- Blau --");
                    Zustand = rot;
                    break;
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

    public void start () {
        t.start();
    }

    public void stoppen () {
        t.interrupt();
    }
}
