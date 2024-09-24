package C_ThreadUnterbrechen;

import java.util.Scanner;

public class ThreadMitInterrupt {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("----- ThreadMitInterrupt gestartet -----");

        //Threadobjekt erzeugen
        UnterbrechungKonsole t = new UnterbrechungKonsole ("Ampel1", 1000);

        //Thread nebenläufig starten
        t.start();

        int eingabe = s.nextInt();

        if (eingabe == 0) {
            t.stoppen();
        }
    }
}
