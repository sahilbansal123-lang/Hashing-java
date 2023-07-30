import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        // Sorted on the basis of key
        tm.put("India", 120);
        tm.put("PAKISTAN", 100);
        tm.put("Hungary", 110);
        tm.put("INDONESIA", 10);
        tm.put("CHINA", 90);
        System.out.println(tm);
    }
}
