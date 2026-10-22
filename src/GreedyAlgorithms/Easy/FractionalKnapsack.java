package GreedyAlgorithms.Easy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    static class ItemComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            double a1 = (1.0 * a[0]) / a[1];
            double b1 = (1.0 * b[0]) / b[1];
            return Double.compare(b1, a1);
        }
    }

    static double fractionalKnapsack(int[] val,int[] wt,int capacity){
        int[][] item=new int[val.length][2];
        for(int i=0;i<item.length;i++){
            item[i][0]=val[i];
            item[i][1]=wt[i];
        }
        Arrays.sort(item,new ItemComparator());
        double res=0.0;
        for(int i=0;i<item.length;i++){
            if(item[i][1]<=capacity){
                res+=item[i][0];
                capacity-=item[i][1];
            }
            else{
                res+=(1.0*item[i][0]/item[i][1])*capacity;
                break;
            }
        }
        return res;
    }
}
