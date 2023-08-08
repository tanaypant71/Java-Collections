import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedhashSet {
    public static void main(String[] args) {
       // Set<Integer> set = new LinkedHashSet<>();

        Set<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(19);
        set.add(45);
        set.add(56);
        set.add(1);

        System.out.println(set);

        set.remove(19);
        System.out.println(set);

        System.out.println(set.contains(56));

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
