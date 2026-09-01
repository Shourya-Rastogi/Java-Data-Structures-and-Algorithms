package ArrayDSA.Medium;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayWithSumK {
    static int countSubarrayWithSumK(int[] nums,int k){
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int preSum=0,cnt=0;
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int remove=preSum-k;
            if (mpp.containsKey(remove)) {
                cnt += mpp.get(remove);
            }

            // Update the frequency of the current prefix sum
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,-3,1,1,1,4,2,-3};
        int counted = countSubarrayWithSumK(arr, 3);
        System.out.println(counted);
    }
}
