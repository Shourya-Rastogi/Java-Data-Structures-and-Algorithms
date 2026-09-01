package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    private void mergeSort(ArrayList<Integer> arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private void merge(ArrayList<Integer> arr,int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            int l= arr.get(left);
            int r= arr.get(right);
            if(l<=r){
                temp.add(l);
                left++;
            }
            else{
                temp.add(r);
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
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(6);
        arr.add(4);
        MergeSort mergeSort=new MergeSort();
        mergeSort.mergeSort(arr,0,8);
        for (int i=0;i<=8;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
