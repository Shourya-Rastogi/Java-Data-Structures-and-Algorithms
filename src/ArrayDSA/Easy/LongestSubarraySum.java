package ArrayDSA.Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySum {

    //Better solution of +ve numbers OR -ve Numbers but Optimal solution for +ve,-ve and Zeros
    static int sol1(int[] nums, int k){
        Map<Integer,Integer> preSumMap=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
            if(sum==k) maxLen=Math.max(maxLen,i+1);
            int rem=sum-k;
            if(preSumMap.containsKey(rem)){
                int len=i- preSumMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            //updates only when sum does not exists ,Zeros cases
            if (!preSumMap.containsKey(sum)) preSumMap.put(sum,i);
        }
        return maxLen;
    }
// Optimal solution for Array containing only positives
    static int sol2(int[] nums,int k){
        int left=0;
        int right=0;
        int sum=nums[0];
        int maxlen=0;
        int n= nums.length;
        while(right<n){
            while(left<=right && sum > k){
                sum-=nums[left];
                left++;
            }
            if(sum==k) {
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<n) sum+=nums[right];
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        //int max=sol1(arr,4);
        int max=sol2(arr,4);
        System.out.println(max);
        int[] arr1={2,0,0,3};
        //int max1=sol1(arr1,3);
        int max1=sol2(arr1,3);
        System.out.println(max1);
    }
}
