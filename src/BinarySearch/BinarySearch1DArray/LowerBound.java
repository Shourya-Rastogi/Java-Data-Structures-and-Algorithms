package BinarySearch.BinarySearch1DArray;

public class LowerBound {
    //Same Solution for SearchInsertPosition problem and ceil function
    static int lowerBound(int[] arr,int target){
        int low=0, high= arr.length-1, ans= arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int lowerBound = lowerBound(nums, 5);
        System.out.println(lowerBound);
    }
}
