package BinarySearch.BinarySearch1DArray;

public class FloorAndCeil {
    static int ceil(int[] arr,int target){
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
    static int floor(int[] arr,int target){
        int low=0, high= arr.length-1, ans= arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}
