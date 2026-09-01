package BinarySearch.BinarySearch1DArray;

public class UpperBound {
    static int upperBound(int[] arr,int target){
        int low=0, high= arr.length-1, ans= arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}

