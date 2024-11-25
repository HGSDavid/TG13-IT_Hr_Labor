import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DavidsMapsUndSets {
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


        // Set erstellen
        HashSet<String> namensListe = new HashSet<>();

        // Set - hinzufügen
        //             (nichts doppelt)
        namensListe.add("Dajana");
        namensListe.add("Sarah");

        namensListe.addAll(Arrays.asList(new String[] {"Milena", "Mona"}));

        // Aus Map hinzufügen
        namensListe.addAll(körpergrößen.keySet());

        // Set - Ausgabe (unschön)
        System.out.println("Folgende Namen sind im Stack: " + namensListe);

        // Set - Auf Inhalt prüfen
        System.out.println("Das Stack enthält Dajana: " + namensListe.contains("Dajana"));

        // Set - entfernen
        namensListe.remove("Sarah");
        System.out.println("Stack nach löschen: " + namensListe);

        // Set - Zusammenfügen
        HashSet<String> andereNamen = new HashSet<>(Arrays.asList(new String[] {"Tina", "Ines"}));
        namensListe.addAll(andereNamen);
        System.out.println("Zusammengeführt: " + namensListe);

        // Set - Schnittmenge
        Set<String> gemeinsam = new HashSet<>(namensListe);
        gemeinsam.retainAll(andereNamen);
        System.out.println("Hinzugefügt wurden: " + gemeinsam);

        // Set - Differenz
        namensListe.removeAll(gemeinsam);
        System.out.println("Übrig bleiben: " + namensListe);
    }
}
