package GreedyAlgorithms.SchedulingAndIntervalProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    int[][] merge(int[][] intervals){
        List<int[]> list = new ArrayList<>();
        if(intervals.length == 0){
            return list.toArray(new int[0][]);
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start=intervals[0][0],end=intervals[0][1];
        for(int[] i:intervals ){
            if(i[0]<=end) end=Math.max(end,i[1]);
            else{
                list.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[0][]);
    }
}
