package A_Listen;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListBsp {

    public static void main(String[] args) {
        String eingabe;

        Scanner s = new Scanner(System.in);
        LinkedList einkaufsliste = new LinkedList<>();

        do {
            System.out.println("--------------------------\nMöchten Sie die Einkaufsliste bearbeiten?\nHinzufügen: h\tEntfernen: e\tSpeichern: s");

            eingabe = s.next();

            if (eingabe.equals("h")) {
                System.out.print("Hinzufügen: ");
                einkaufsliste.add(s.next());

            } else if (eingabe.equals("e")) {
                System.out.print("Entfernen: ");
                einkaufsliste.remove(s.next());

            } else if (eingabe.equals("s")) {
                System.out.print("Speichern\n--------------------------");
                break;

            } else {
                System.out.println("Eingabe ungültig :(");
            }
        } while (true);

        System.out.println(einkaufsliste);
    }
}
