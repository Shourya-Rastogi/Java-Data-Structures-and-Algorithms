package GreedyAlgorithms.SchedulingAndIntervalProblems;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    int nonOverlappingIntervals(int[][] intervals){
        Arrays.sort(intervals,new IntervalComparator());
        int n=intervals.length;
        int cnt=1;
        int lastEndTime=intervals[0][1];
        for(int i=0;i<n;i++){
            if(intervals[i][0]>=lastEndTime){
                cnt++;
                lastEndTime=intervals[i][1];
            }
        }
        return n-cnt;
    }
    class IntervalComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[1],b[1]);
        }
    }
}
