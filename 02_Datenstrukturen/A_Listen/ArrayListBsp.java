package A_Listen;

import java.util.ArrayList;

public class ArrayListBsp {

    public static void main(String[] args) {

        // ArrayList erstellen
        ArrayList<Integer> messwerte = new ArrayList<>();

        messwerte.add(3);
        messwerte.add(-65);
        messwerte.add(33);
        messwerte.add(2);
        messwerte.add(9);

        // Ausgabe
        System.out.println(messwerte);

        for (Integer messwert : messwerte) {
            System.out.println("Messwert: " + messwert);
        }

        // Zugriff über den Index
        Integer i1 = messwerte.get(0);
        System.out.println(i1);

        messwerte.remove(Integer.valueOf(33));

        System.out.println(messwerte);

        if(messwerte.contains(2)) {
            System.out.println("Zwei ist in der Liste");
        }
    }
}
