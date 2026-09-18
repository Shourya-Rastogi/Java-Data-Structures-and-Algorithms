package SlidingWindownAndTwoPointers.Medium;

public class NiceSubarrays {
    int numSubarraysWithSum(int[] nums, int goal) {
        return lessThanSum(nums,goal)-lessThanSum(nums,goal-1);
    }

    private int lessThanSum(int[] nums,int goal){
        if(goal<0) return 0;
        int l=0, r=0, sum=0,cnt=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>goal){
                sum-=nums[l++]%2;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}
