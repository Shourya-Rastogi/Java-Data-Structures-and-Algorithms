package StackAndQueues.MonotonicStackAndQueue;

public class TrappingRainwater {
    int findTotal(int[] nums){
        int l=0;
        int r=nums.length-1;
        int lMax=0;
        int rMax=0;
        int total=0;
        while(l<r){
            if(nums[l]<=nums[r]){
                if(lMax>nums[l]) total+=lMax-nums[l];
                else lMax=nums[l];
                l++;
            }
            else{
                if(rMax>nums[r]) total+=rMax-nums[r];
                else rMax=nums[r];
                r--;
            }
        }
        return total;
    }
}
