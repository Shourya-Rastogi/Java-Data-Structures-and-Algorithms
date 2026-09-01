package ArrayDSA.Medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[] twoSum(int[] nums,int target){
        int n= nums.length;
        Map<Integer,Integer> elements=new HashMap<>();
        for(int i=0;i<n;i++){
            int rem=target - nums[i];
            if(elements.containsKey(rem)) return new int[]{elements.get(rem),i};
            elements.put(nums[i],i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=14;
        int[] ans=twoSum(arr,target);
        for(int i: ans){
            System.out.println(i);
        }
    }
}
