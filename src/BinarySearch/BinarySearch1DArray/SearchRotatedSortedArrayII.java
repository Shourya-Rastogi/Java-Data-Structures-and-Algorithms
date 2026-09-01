package BinarySearch.BinarySearch1DArray;

public class SearchRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while(start <= end){
                int mid = (start+end)/2;
                if(nums[mid] == target){
                    return true;
                }
                // if duplicate start and mid reduce current window from left and right
                if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                    start++;
                    end--;
                    continue;
                }
                // left side is sorted
                if(nums[start] <= nums[mid]){
                    // checks that the target is lie in left side of mid
                    if(nums[start] <= target && target < nums[mid]){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
                else{ // right side is sorted
                    // checks that the target is lie in right side of mid
                    if(nums[end] >= target && target > nums[mid]){
                        start = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
            }
            return false;
        }

    static int searchinRotatedSortedArray(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            if(nums[low]==nums[mid]&&nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            //left sorted
            if (nums[low]<=nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;

                } else low = mid + 1;
            }
            //right Sorted
            else{
                if(nums[mid]<=target&&target<=nums[high]){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }
}
