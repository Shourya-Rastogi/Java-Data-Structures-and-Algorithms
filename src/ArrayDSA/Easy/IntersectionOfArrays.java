package ArrayDSA.Easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {
    static List<Integer> intersection(int[] a,int[] b){
        int m=a.length;
        int n=b.length;
        int i=0;
        int j=0;
        List<Integer> ans = new ArrayList<>();
        while(i<m && j<n){
            if(a[i]<b[j]) i++;
            else if (a[i]>b[j]) j++;
            else{
                if (ans.isEmpty() || !ans.contains(a[i])){
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};

        List<Integer> result = intersection(arr1, arr2);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) System.out.print(val + " ");
    }

}
