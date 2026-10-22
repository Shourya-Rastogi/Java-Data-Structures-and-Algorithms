package GreedyAlgorithms.SchedulingAndIntervalProblems;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {
    int minPlatforms(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int cnt=0,maxcnt=0,i=0,j=0;
        while(i<n){
            if(arr[i]<dep[j]){
                cnt++;
                i++;
            }
            else{
                cnt--;
                j++;
            }
            maxcnt=Math.max(maxcnt,cnt);
        }
        return maxcnt;
    }
}
