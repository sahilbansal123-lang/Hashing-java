package HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMaps { // ordered

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("china", 120);
        lhm.put("Sri lanka", 10);

        System.out.println(lhm);
    }
}
