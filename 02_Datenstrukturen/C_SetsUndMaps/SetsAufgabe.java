import java.util.HashSet;
import java.util.Set;

public class SetsAufgabe {
    public static void main(String[] args) {
        Set<String> mitarbeiter = new HashSet<>();

        mitarbeiter.add("Dajana");
        mitarbeiter.add("Milena");
        mitarbeiter.add("Johanna");

        System.out.println("MittarbeiterSet: " + mitarbeiter);

        // Größe des Sets
        System.out.println("Größe: " + mitarbeiter.size());

        // Suche nach einem Element
        System.out.println("Ist Dajana im Set? " + mitarbeiter.contains("Dajana"));

        Set<String> chefs = new HashSet<>();
        chefs.add("David");

        // vereinigen
        Set<String> puff = new HashSet<>(chefs);
        System.out.println("ChefSet: " + chefs);
        puff.addAll(mitarbeiter);
        System.out.println("PuffSet: " + puff);
    }
}
