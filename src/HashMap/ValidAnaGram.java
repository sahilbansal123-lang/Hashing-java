package HashMap;

import java.util.HashMap;

public class ValidAnaGram {

    public static Boolean isValid(String s , String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(i) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) != null) {
                if (map.get(t.charAt(i)) == 1){
                    map.remove(t.charAt(i));
                } else {
                    map.put(s.charAt(i), map.get(i) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(isValid(s, t));
    }
}
