package GreedyAlgorithms.SchedulingAndIntervalProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Same Problem as Minimum Number Of Platforms
public class DivideIntervalsInMinimumNumberOfGroups {
    public int minGroups(int[][] intervals) {
        List<int[]> events=new ArrayList<>();
        for(int[] interval:intervals){
            events.add(new int[]{interval[0],1});
            events.add(new int[]{interval[1]+1,-1});
        }
        Collections.sort(events,(a, b)->{
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }else{
                return Integer.compare(a[0],b[0]);
            }
        });
        int concurrentIntervals=0;
        int maxConcurrentIntervals=0;
        for(int[] event:events){
            concurrentIntervals+=event[1];
            maxConcurrentIntervals=Math.max(maxConcurrentIntervals,concurrentIntervals);
        }
        return maxConcurrentIntervals;
    }

    public int minGroups1(int[][] intervals) {
        int n = intervals.length;
        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = intervals[i][0];
            dep[i] = intervals[i][1];
        }

        Arrays.sort(arr);
        Arrays.sort(dep);

        int count = 0;
        int i = 0;
        int j = 0;
        int maxgroups = 0;
        while (i < n) {
            if (arr[i] <= dep[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            maxgroups = Math.max(maxgroups, count);
        }
        return maxgroups;
    }
}
