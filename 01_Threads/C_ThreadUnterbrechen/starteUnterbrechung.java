package C_ThreadUnterbrechen;

import java.util.Scanner;

public class starteUnterbrechung {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("----- ThreadMitInterrupt gestartet -----");

        //Threadobjekt erzeugen
        Unterbrechung t = new Unterbrechung ("Ampel1", 1000);

        //Thread nebenläufig starten
        t.start();

        int eingabe = s.nextInt();

        if (eingabe == 0) {
            t.stoppen();
        }
    }
}
