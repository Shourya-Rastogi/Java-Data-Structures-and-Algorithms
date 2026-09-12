package StackAndQueues.MonotonicStackAndQueue;
public class MaximalRectangle {
    int maximalRectangle(char[][] matrix) {
        LargestRectangleInHistogram largest=new LargestRectangleInHistogram();
        int n=matrix.length;
        int m=matrix[0].length;
        int maxArea=0;
        int[][] pSum=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=matrix[i][j]-'0';
                if(matrix[i][j]=='0') sum=0;
                pSum[i][j]=sum;
            }
        }
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,largest.largestRectangleArea(pSum[i]));
        }
        return maxArea;
    }
}
