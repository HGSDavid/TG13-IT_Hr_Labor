import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Maps {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String eingabe;

        HashMap<String, String> bundesLaender = new HashMap<>();

        bundesLaender.put("Baden-Wuertemberg", "Stuttgart");
        bundesLaender.put("Bayern", "München");
        bundesLaender.put("Nordrein-Westfalen", "Düsseldorf");
        bundesLaender.put("Berlin", "Berlin");
        bundesLaender.put("Bremen", "Bremen");
        bundesLaender.put("Hamburg", "Hamburg");

        System.out.println("bundesländerMap erstellt: " + bundesLaender);

        // nur Keys
        HashSet<String> laender = new HashSet<>(bundesLaender.keySet());
        System.out.println("Diese Bundesländer sind gespeichert: " + laender);

        // nur Values
        ArrayList<String> staedte = new ArrayList<>(bundesLaender.values());
        System.out.println("Diese Städte sind gespeichert: " + staedte);

        while (true) {
            // Bestimmter Key
            System.out.println("Von welchem Bundesland möchtest du die Hauptstadt?");
            eingabe = s.next();
            System.out.println("Die Hauptstadt von " + eingabe + " ist " + bundesLaender.get(eingabe));            
        }
    }
}
