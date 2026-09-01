package ArrayDSA.Hard;

import java.util.ArrayList;
import java.util.List;

public class ReversePair {
    static int bruteforce(int[] arr){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]> 2*arr[j]) cnt++;
            }
        }
        return cnt;
    }
    static int reversePairs(int[] nums){
        return mergeSort(nums,0,nums.length-1);
    }
    static int countPairs(int[] nums,int low,int mid,int high){
        int cnt=0;
        int right=mid+1;
        for (int i=low;i<=mid;i++){
            while(right<=high && nums[i]>2*nums[right]) right++;
            cnt+=right-mid-1;
        }
        return cnt;
    }
    static int mergeSort(int[] nums,int low,int high){
        if(low>=high) return 0;
        int cnt=0;
        int mid=(low+high)/2;
        cnt+=mergeSort(nums,low,mid);
        cnt+=mergeSort(nums,mid+1,high);
        cnt += countPairs(nums, low, mid, high);
        merge(nums,low,mid,high);
        return cnt;
    }
    static void merge(int[] nums,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(nums[left]<nums[right]) temp.add(nums[left++]);
            else temp.add(nums[right++]);
        }
        while(left<=mid) temp.add(nums[left++]);
        while(right<=high) temp.add(nums[right++]);
        for(int i=low;i<=high;i++){
            nums[i]= temp.get(i-low);
        }
    }

}
