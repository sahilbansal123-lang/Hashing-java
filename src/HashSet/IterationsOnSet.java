package HashSet;
import java.util.*;

public class IterationsOnSet {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Kolkata");
        cities.add("Hyderabad");


        //  Iterator method Time Complexity O(N)
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //  Enhanced ForLoop Time Complexity O(N)



    }
}
