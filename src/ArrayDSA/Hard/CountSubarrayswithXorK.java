package ArrayDSA.Hard;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayswithXorK {
    static int countSubarrayWithXorK(int[] nums,int k){
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int xr=0,cnt=0;
        for(int i=0;i<nums.length;i++){
            xr^=nums[i];
            int x=xr^k;
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums={4,2,2,6,4};
        int count = countSubarrayWithXorK(nums, 6);
        System.out.println(count);

    }
}
