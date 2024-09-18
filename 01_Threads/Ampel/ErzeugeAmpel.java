package Ampel;

public class ErzeugeAmpel {
    public static void main(String[] args) {
        System.out.println("----- Ampel gestartet -----");

        //Threadobjekt erzeugen
        Ampel a1 = new Ampel("Ampel1", 500);

        //Thread nebenläufig starten
        a1.start();
    }
}
