package GreedyAlgorithms.SchedulingAndIntervalProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NMeetingsInOneRoom {
    private class data{
        int start;
        int end;
        int pos;
        data(int start,int end,int pos){
            this.start=start;
            this.end=end;
            this.pos=pos;
        }
    }
    List<Integer> schedule(int[] start, int[] end){
        int n=start.length;
        data[] arr=new data[n];
        for(int i=0;i<n;i++){
            arr[i].start=start[i];
            arr[i].end=end[i];
            arr[i].pos=i+1;
        }
        Arrays.sort(arr,new IntervalComparator());
        int cnt=1,freeTime=arr[0].end;
        List<Integer> ds=new ArrayList<>();
        ds.add(arr[0].pos);
        for(int i=1;i<n;i++){
            if(arr[i].start>freeTime){
                cnt++;
                freeTime=arr[i].end;
                ds.add(arr[i].pos);
            }
        }
        return ds;
    }
    class IntervalComparator implements Comparator<data> {
        public int compare(data a, data b) {
            return Integer.compare(a.end,b.end);
        }
    }
}
