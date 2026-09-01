package LeetcodePractice;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayRankTransform {

    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int m = 0;
        for (int x : sorted) {
            if (m == 0 || sorted[m - 1] != x) {
                sorted[m++] = x;
            }
        }

        int[] unique = Arrays.copyOf(sorted, m);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.binarySearch(unique, arr[i]) + 1;
        }

        return arr;
    }
    static int[] arrayRankTransform2(int[] arr){
        int[] temp = Arrays.copyOf(arr, arr.length);

        Arrays.sort(temp);

        int rank = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int ele : temp) {
            if (!hm.containsKey(ele)) {
                hm.put(ele, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = hm.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums={100,100,100};
        for (int num : arrayRankTransform2(nums)) {
            System.out.print(num+" ");
        }

    }
}
