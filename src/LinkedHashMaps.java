import java.util.LinkedHashMap;

public class LinkedHashMaps {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("china", 120);
        lhm.put("srilanka", 10);

        System.out.println(lhm);
    }
}
