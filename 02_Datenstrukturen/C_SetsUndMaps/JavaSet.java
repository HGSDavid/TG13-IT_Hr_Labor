import java.util.*;

public class JavaSet {
    public static void main(String[] args) {
// Hash Set

        Set<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");
        System.out.println(set.add("Hello"));
        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("Hat set Hello: " + set.contains("Hello"));

        set.remove("Hello");
        System.out.println("Hello entfernt: " + set.contains("Hello"));
        System.out.println(set);

        set.clear();
        System.out.println("Set geleert: " + set);

        System.out.println("Set ist leer: " + set.isEmpty());

        System.out.println("Set hat " + set.size() + " Elemente");

        // LinkedHashSet

        Set<String> linkedSet = new LinkedHashSet<String>();
        linkedSet.add("Hello");
        linkedSet.add("World");
        linkedSet.add(null);
        System.out.println(linkedSet.add("Hello"));
        System.out.println(linkedSet);

        // Tree Set
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(6);
        System.out.println(treeSet);

        for (Integer i : treeSet) {
            System.out.println(i);
        }

        System.out.println("HeadSet vor 4:" + treeSet.tailSet(4,true));
        //SubSet
        System.out.println("SubSet von 2 bis 5: " + treeSet.subSet(2,true,5,false));

        
    }
}
