package GreedyAlgorithms.Easy;

public class JumpGameI {
    boolean jump(int[] arr){
        int maxInd=0;
        for(int i=0;i<arr.length-1;i++){
            if(i>maxInd) return false;
            maxInd=Math.max(maxInd,i+arr[i]);
        }
        return true;
    }
}
