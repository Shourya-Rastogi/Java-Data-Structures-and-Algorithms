package ArrayDSA.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOFArrays {
    static List<Integer> union(int[] a, int[] b){
        int n1=a.length;
        int n2= b.length;
        int i=0;
        int j=0;
        List<Integer> unionArr=new ArrayList<>();
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if (unionArr.isEmpty() || unionArr.get(unionArr.size()-1)!=a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            }
            else if(a[i]>b[j]){
                if (unionArr.isEmpty() || unionArr.get(unionArr.size()-1)!=b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            }
            else{
                if (unionArr.isEmpty() || unionArr.get(unionArr.size()-1)!=a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n1){
            if (unionArr.isEmpty() || unionArr.get(unionArr.size()-1)!=a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }
        while(j<n2){
            if (unionArr.isEmpty() || unionArr.get(unionArr.size()-1)!=b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }
        return unionArr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        List<Integer> result = union(arr1, arr2);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) System.out.print(val + " ");
    }
}
