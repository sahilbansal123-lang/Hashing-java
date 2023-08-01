package HashSet;

import java.util.HashSet;

public class HashSetImplementation {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);
        if (set.contains(2)) {
            set.remove(2);
            System.out.println(set);
            System.out.println("element present");
        }
        if (!set.contains(6)) {
            System.out.println("Element not present");
        }
    }
}
