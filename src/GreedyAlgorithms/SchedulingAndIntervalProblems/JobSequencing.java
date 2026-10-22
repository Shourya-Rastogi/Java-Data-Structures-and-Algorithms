package GreedyAlgorithms.SchedulingAndIntervalProblems;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    private class Job{
        int id;
        int profit;
        int deadline;
    }
    class JobComparator implements Comparator<Job> {
        public int compare(Job a, Job b) {
            return Integer.compare(b.profit,a.profit);
        }
    }
    int sequencing(Job[] arr){
        Arrays.sort(arr,new JobComparator());
        int totProfit=0,cnt=0,maxDeadline=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            maxDeadline=Math.max(maxDeadline,arr[i].deadline);
        }
        int[] hash=new int[maxDeadline+1];
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j<=0;j--){
                if(hash[j]==-1){
                    cnt++;
                    hash[i]=arr[i].id;
                    totProfit+=arr[i].profit;
                    break;
                }
            }
        }
        return totProfit;
    }
}
