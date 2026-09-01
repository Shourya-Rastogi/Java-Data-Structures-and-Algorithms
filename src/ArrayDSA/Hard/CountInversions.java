package ArrayDSA.Hard;

import java.util.ArrayList;
import java.util.List;

public class CountInversions {
    static int bruteforce(ArrayList<Integer> arr){
        int cnt=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j< arr.size();j++){
                if(arr.get(i)> arr.get(j)) cnt++;
            }
        }
        return cnt;
    }
    static int countInversions(ArrayList<Integer> arr){
        int cnt = mergeSort(arr, 0, arr.size() - 1);
        return cnt;
    }
    static int mergeSort(ArrayList<Integer> arr, int low, int high){
        int cnt=0;
        if(low>=high) return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=merge(arr,low,mid,high);
        return cnt;
    }
    static int merge(ArrayList<Integer> arr,int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        int cnt=0;
        while(left<=mid&&right<=high){
            int l= arr.get(left);
            int r= arr.get(right);

            if(l<=r){
                temp.add(l);
                left++;
            }
            else{
                temp.add(r);
                cnt+=mid-left+1;
                right++;
            }
        }
        while(left<=mid){
            int l= arr.get(left);
            temp.add(l);
            left++;
        }
        while(right<=high){
            int r= arr.get(right);
            temp.add(r);
            right++;
        }
        for(int i=low;i<=high;i++){
            int ele=temp.get(i-low);
            arr.set(i,ele);
        }
        return cnt;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(List.of(5,3,2,4,1));
        int inversions = countInversions(arr);
        System.out.println(inversions);

    }
}
