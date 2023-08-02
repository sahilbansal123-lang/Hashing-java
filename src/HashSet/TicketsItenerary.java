package HashSet;

import java.util.HashMap;

public class TicketsItenerary {

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revTic = new HashMap<>();

        for (String key: tickets.keySet()) {
            revTic.put(tickets.get(key), key);
        }

        for (String key: tickets.keySet()) {
            if (!revTic.containsKey(key)) {
                return key;
            }
        }
        return null;
    }


    public static void main(String[] args) {

    }
}
