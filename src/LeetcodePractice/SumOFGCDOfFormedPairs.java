package LeetcodePractice;

import java.util.*;

public class SumOFGCDOfFormedPairs {
    static int gcd(int a,int b){
        while (a>0&&b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        else return a;
    }
    static long gcdSum(int[] nums){
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            int gcd=gcd(nums[i],max);
            nums[i]=gcd;
        }
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        long ans=0;
        while(i<j){
            ans=ans+gcd(nums[i++],nums[j--]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={3,6,2,8};
        long ans=gcdSum(nums);
        System.out.println(ans);
    }
}
