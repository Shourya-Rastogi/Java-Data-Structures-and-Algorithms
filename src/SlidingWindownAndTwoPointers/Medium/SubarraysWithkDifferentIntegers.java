package SlidingWindownAndTwoPointers.Medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithkDifferentIntegers {
    int subarraysWithkDifferentIntegers(int[] nums,int k){
        return subarraysLessThanK(nums,k)-subarraysLessThanK(nums,k-1);
    }

    int subarraysLessThanK(int[] nums,int k){
        int l=0, r=0,cnt=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        while(r<nums.length){
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
            while(mpp.size()>k){
                mpp.put(nums[l],mpp.get(nums[l])-1);
                if(mpp.get(nums[l])==0) mpp.remove(nums[l]);
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}
