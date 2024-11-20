import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Maps3 {
    public static void main(String[] args) {
        
        System.out.println("Test Maps mit eigenen Klassen");

        //Objekte erstellen
        Schueler s1=new Schueler("Meier","Max");
        Schueler s2=new Schueler("Prol","Conrad");
        Schueler s3=new Schueler("Kuscher","Kevin");

        Parkplatz p1 = new Parkplatz("a1");
        Parkplatz p2 = new Parkplatz("a2");
        Parkplatz p3 = new Parkplatz("a3");

        //Map mit Schuelern und Parkplätzen
        Map<Schueler, Parkplatz> map = new HashMap<Schueler, Parkplatz>();
        map.put(s1,p2);
        map.put(s2, p3);
        map.put(s3, p1);

        // Elements can traverse in any order
       System.out.println("\n----- Parkplätze der Schueler ---------");
       for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Schuelerliste
        System.out.println("\n----- Schuelerliste ---------");
        List<Schueler> schuelerliste = new ArrayList<>(map.keySet());
        for (Schueler schueler : schuelerliste) {
            System.out.println(schueler);
        }


        //Parkplatzliste
         System.out.println("\n----- Parkplatzliste ---------");
        List<Parkplatz> parkplatzliste = new ArrayList<>(map.values());
        for (Parkplatz parkplatz : parkplatzliste) {
            System.out.println(parkplatz);
        }


        //Parkplatz eines Schuelers bestimmen
        System.out.println("\n----- Parkplatz eines Schuelers ---------");
        Parkplatz p = map.get(s1);
        System.out.println("Der Schüler "+s1.getName()+" hat den Parkplatz "+p.getParkplatzNr());

    }
}