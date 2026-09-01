package ArrayDSA.Hard;

public class LongestSubarrayProduct {
    static int longest(int[] nums){
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=nums[i];
            suffix*=nums[n-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={-2,3,4,-1,0,-2,3,1,4,0,6,-1,4};
        System.out.println(longest(nums));
    }
}
