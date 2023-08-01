package HashMap;

import java.util.HashMap;

public class MajorityElements {

    public static void majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

//            if (map.containsKey(curr)) {
//                map.put(curr, map.get(curr) + 1);
//            } else {
//                map.put(curr, 1);
//            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer keys: map.keySet()) {
            if (map.get(keys) > nums.length/3) {
                System.out.println(keys);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElement(nums);
    }
}
