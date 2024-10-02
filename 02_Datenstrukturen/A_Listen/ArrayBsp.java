package A_Listen;

public class ArrayBsp {

    public static void main(String[] args) {
        
        String[] names = new String[3];

        names[0]="Max";
        names[1]="Michele";
        names[2]="Tina";

        for (String name : names) {
            System.out.println(name);
        }
    }
}