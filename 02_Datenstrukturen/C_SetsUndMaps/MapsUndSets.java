import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MapsUndSets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Map erstellen
        HashMap<String, Integer> körpergrößen = new HashMap<>();

        // Map - Hinzufügen
        //            Key (einmalig), Value
        körpergrößen.put("David", 187);
        körpergrößen.put("Jannek", 420);

        // Map - Ausgeben (unschön)
        System.out.println("Folgende Körpergrößen sind gespeichert: " + körpergrößen);

        // Map - Einzelausgabe
        System.out.println("Janneks Größe: " + körpergrößen.get("Jannek"));

        // Map - Auf Key prüfen
        System.out.println("Map Enthält David: " + körpergrößen.containsKey("David"));

        // Map - Auf Value prüfen
        System.out.println("Jemand ist 187cm groß: " + körpergrößen.containsValue(187));

        // Map - Keys extrahieren
        System.out.println("Folgende Personen wurden registriert: " + körpergrößen.keySet());

        // Map - Entfernen
        körpergrößen.remove("Jannek");
        System.out.println("Map nach löschen: " + körpergrößen);


        // Stack erstellen
        HashSet<String> namensListe = new HashSet<>();

        // Stack - hinzufügen
        //             (nichts doppelt)
        namensListe.add("Dajana");
        namensListe.add("Sarah");

        // Aus Map hinzufügen
        namensListe.addAll(körpergrößen.keySet());

        // Stack - Ausgabe (unschön)
        System.out.println("Folgende Namen sind im Stack: " + namensListe);

        // Stack - Auf Inhalt prüfen
        System.out.println("Das Stack enthält Dajana: " + namensListe.contains("Dajana"));

        // Stack - entfernen
        namensListe.remove("Sarah");
        System.out.println("Stack nach löschen: " + namensListe);
    }
}
