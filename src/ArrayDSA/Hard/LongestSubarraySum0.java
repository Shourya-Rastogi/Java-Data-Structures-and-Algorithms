package ArrayDSA.Hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySum0 {
    static int longest(int[] nums){
        int max=0;
        int sum=0;
        Map<Integer,Integer> preSum=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0) max=i+1;
            else{
                if(!preSum.containsKey(sum)) preSum.put(sum,i);
                else max=Math.max(max,i- preSum.get(sum));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println(longest(arr));
    }
}
