package BinarySearch.BinarySearchOnSearchSpace;

public class SplitArrayLargestSum {
    int splitArray(int[] nums,int k){
        int n=nums.length;
        if(n<k) return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            high+=nums[i];
            if(low<nums[i]) low=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int Nosubarrays=1;
            int subarraySum=0;
            for(int i=0;i<nums.length;i++){
                if(subarraySum+nums[i]<=mid) subarraySum+=nums[i];
                else{
                    Nosubarrays++;
                    subarraySum=nums[i];
                }
            }
            if(Nosubarrays>k) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

}
