package BinarySearch.BinarySearch2DArray;

public class RowWithMaximum1s {
    int lowerBound(int[] arr,int target){
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

    int maximum1s(int[][] matrix){
        int n=matrix.length;
        int countmax=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            int countones=n-lowerBound(matrix[i],1);
            if(countones>countmax){
                countmax=countones;
                index=i;
            }
        }
        return index;
    }
}
