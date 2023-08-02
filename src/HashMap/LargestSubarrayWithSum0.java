package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class LargestSubarrayWithSum0 {

    public static void largestSubArray(int []arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                length = Math.max(length, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println("Length of subArray is: " + length);
    }

    public static void main(String[] args) {
        int arr[] = {15, 2, -2, -8, 1, 7, 10};
        largestSubArray(arr);
    }
}
