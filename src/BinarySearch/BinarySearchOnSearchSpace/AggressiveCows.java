package BinarySearch.BinarySearchOnSearchSpace;

import java.util.Arrays;

public class AggressiveCows {
    int aggresiveCows(int[] arr,int cows){
        Arrays.sort(arr);
        int n=arr.length;
        int low=0, high=arr[n-1]-arr[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canWePlace(arr,mid,cows)) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
    boolean canWePlace(int[] arr,int dist,int cows){
        int countcows=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                countcows++;
                last=arr[i];
            }
            if(countcows>=cows) return true;
        }
        return false;
    }
}
