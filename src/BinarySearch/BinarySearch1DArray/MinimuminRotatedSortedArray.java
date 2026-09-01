package BinarySearch.BinarySearch1DArray;

public class MinimuminRotatedSortedArray {
    static int findmin(int[] nums){
        int low=0;
        int high= nums.length-1;
        int ans= Integer.MIN_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[high]){
                ans=Integer.min(ans,nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){
                ans=Integer.min(ans,nums[low]);
                low=mid=1;
            } else{
                ans=Integer.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
