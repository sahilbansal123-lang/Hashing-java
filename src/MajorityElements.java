import java.util.HashMap;
import java.util.Set;

public class MajorityElements {

    public static void majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

//            if (map.containsKey(curr)) {
//                map.put(curr, map.get(curr) + 1);
//            } else {
//                map.put(curr, 1);
//            }

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Set<Integer> keySet = map.keySet();
        for (Integer keys: keySet) {
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