package HashSet;

import java.util.HashMap;

public class SubArraySumisK {

    public static void subArraySum(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum-k)) {
                ans += map.get(sum-k);
            }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subArraySum(arr, 3);
    }
}
