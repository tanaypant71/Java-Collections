import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(19);
        set.add(45);
        set.add(56);

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
