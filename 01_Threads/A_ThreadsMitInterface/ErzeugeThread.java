package A_ThreadsMitInterface;

public class ErzeugeThread{
    public static void main(String[] args){
        System.out.println("----- ThreadMitInterface gestartet -----");
        
        //Threadobjekte erzeugen
        MeinThread a = new MeinThread("a", 3);
        MeinThread b = new MeinThread("b", 10);

        //Thread nebenläufig starten
        a.start();
        b.start();
    }
}