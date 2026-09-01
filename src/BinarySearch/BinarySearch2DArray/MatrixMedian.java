package BinarySearch.BinarySearch2DArray;

public class MatrixMedian {
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
    static int countsmallereqaulto(int[][] mat,int x){
        int count=0;
        for(int i=0;i<mat.length;i++) count+=upperBound(mat[i],x);
        return count;
    }
    static int median(int[][] mat){
        int low=Integer.MAX_VALUE, high=Integer.MIN_VALUE;
        int n= mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][m-1]);
        }
        int req=(n*m)/2;
        while(low<=high){
            int mid=(low+high)/2;
            int smallerEquals=countsmallereqaulto(mat,mid);
            if(smallerEquals<=req) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] mat={{1, 4, 9}, {2, 5, 6}, {3, 7, 8} };
        int median = median(mat);
        System.out.println(median);
    }
}
