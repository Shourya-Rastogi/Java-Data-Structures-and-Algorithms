package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
    private void quickSort(ArrayList<Integer> arr,int low ,int high){
        if(low<high){
            int partition=partition(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }
    private int partition(ArrayList<Integer> arr,int low,int high){
        int pivot=arr.get(low);
        int i=low;
        int j=high;
        while(i<j){
            while(arr.get(i)<=pivot && i<=high-1) i++;
            while(arr.get(j)> pivot && j>=low+1) j--;
            if(i<j) {
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    private void swap(ArrayList<Integer> arr,int i,int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }

    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();
        ArrayList<Integer> nums=new ArrayList<>();
        Collections.addAll(nums,4,6,2,5,7,9,1,3);
        quickSort.quickSort(nums,0,7);
        for(int i=0;i<=7;i++){
            System.out.print(nums.get(i)+" ");
        }
    }


}
