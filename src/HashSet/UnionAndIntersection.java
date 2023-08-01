package HashSet;

import java.util.HashSet;

public class UnionAndIntersection {

    public static void union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
    public static void Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            int elem = arr2[i];
            if (set.contains(arr2[i])) {
                count++;
                set.remove(elem);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr2[] = {6, 3, 9, 2, 9, 4};
        int arr1[] = {7, 3, 9};

        union(arr1, arr2);
        Intersection(arr1,arr2);
    }
}
