package BinarySearch.BinarySearchOnSearchSpace;

import java.util.Arrays;

public class KokoEatingBananas {
    int maxEl(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max) max=num;
        }
        return max;
    }
    long timetaken(int[] piles,int speed){
        long total=0;
        for(int num:piles){
            total+=(int)Math.ceil((double)num/speed);
        }
        return total;
    }
    int minEatingSpeed(int[] piles,int h){
        int low=1;
        int high= Arrays.stream(piles).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            long totalhrs=timetaken(piles,mid);
            if(totalhrs<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] piles={805306368,805306368,805306368};
        int h=1000000000;
        KokoEatingBananas k=new KokoEatingBananas();
        int minEatingSpeed = k.minEatingSpeed(piles, h);
        System.out.println(minEatingSpeed);
    }
}
