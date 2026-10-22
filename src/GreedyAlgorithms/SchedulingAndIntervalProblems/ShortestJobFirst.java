package GreedyAlgorithms.SchedulingAndIntervalProblems;

import java.util.Arrays;

public class ShortestJobFirst {
    int sjf(int[] arr){
        Arrays.sort(arr);
        int t=0;
        int wt=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            wt+=t;
            t+=arr[i];
        }
        return wt/n;
    }
}
