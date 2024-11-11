package E_Discolicht;

import java.util.Scanner;

public class StarteDiscolicht {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("----- Ampel gestartet -----");

        Scanner s;
        s = new Scanner(System.in);

        Discolicht dl1 = new Discolicht("Decke", 500);
        Discolicht dl2 = new Discolicht("Boden", 1000);

        while (true) {

            String eingabe = s.next();
            System.out.println("Eingabe: " + eingabe);

            if (eingabe.equals("starteDecke")) {
                dl1.start();
            } else if (eingabe.equals("starteBoden")) {
                dl2.start();
            } else if (eingabe.equals("stoppeDecke")) {
                dl1.stoppen();
            } else if (eingabe.equals("stoppeBoden")) {
                dl2.stoppen();
            } else {
                System.out.println("Eingabe ungültig");
            }
        }
    }
}
