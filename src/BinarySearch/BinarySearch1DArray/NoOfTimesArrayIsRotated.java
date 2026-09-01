package BinarySearch.BinarySearch1DArray;

public class NoOfTimesArrayIsRotated {
    static int rotations(int[] nums){
        int low=0;
        int high= nums.length-1;
        int ans= Integer.MIN_VALUE;
        int index=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[high]){
                if(nums[low]<ans){
                    ans=nums[low];
                    index=low;
                }
                break;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<ans){
                    ans=nums[low];
                    index=low;
                }
                low=mid+1;
            } else{
                if(nums[mid]<ans){
                    ans=nums[mid];
                    index=mid;
                }
                high=mid-1;
            }
        }
        return index;
    }
}
