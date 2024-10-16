import java.util.*;

public class UDIBeispiel {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);


        // Intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        // Union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union: " + union);

        // Difference
        Set<Integer> difference = new HashSet<Integer>(a);
        System.out.println("A" + a);
        System.out.println("B" + b);
        difference.removeAll(b);
        System.out.println("Difference: " + difference);
    }
}
