package A_Listen;

import java.util.ArrayList;

public class ArrayListBsp2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Dajana");
        names.add("Tina");
        names.add("Milena");
        names.add("Löwe");
        names.add("Leiz");
        names.add("Walheim");

        // Gesamtausgabe
        System.out.println("Arraylist: " + names);
        
        // Sortieren
        names.sort(null);
        System.out.println("Sortiert: " + names);

        // Einzelausgabe
        int i = 1;
        for (String name : names) {
            System.out.println("Name" + i + ": " + name);
            i++;
        }
        i = 0;

        // Bestimmte Ausgabe
        System.out.println("Name3: " + names.get(3));

        // Abfrage von Inhalt
        if (names.contains("Dajana")) {
            System.out.println("HighBit");
        } else {
            System.out.println("LowBit");
        }
    }
}
