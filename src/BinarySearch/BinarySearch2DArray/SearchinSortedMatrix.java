package BinarySearch.BinarySearch2DArray;

public class SearchinSortedMatrix {

    //Doesnot work properly
    static boolean searchMatrix(int[][] matrix, int target) {
        int lowrow=0;
        int highrow=matrix.length-1;
        int m=matrix[0].length;
        while(lowrow<=highrow){
            int midrow=(lowrow+highrow)/2;
            if(matrix[midrow][0]<=target && matrix[midrow][m-1]>=target){
                int lowcol=0;
                int highcol=m-1;
                while(lowcol<=highcol){
                    int midcol=(lowcol+highcol)/2;
                    if(matrix[midrow][midcol]==target) return true;
                    else if (matrix[midrow][midcol]>target) {
                        highcol=midcol-1;
                    }
                    else lowcol=midcol+1;
                }
            } else if (matrix[midrow][0]>target) {
                highrow=midrow-1;
            }
            else lowrow=midrow+1;
        }
        return false;
    }

    static boolean searchMatrix1(int[][] matrix, int target) {
        int m=matrix[0].length;
        int low=0;
        int high=matrix.length*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        boolean b = searchMatrix1(matrix, 6);
        System.out.println(b);
    }
}
