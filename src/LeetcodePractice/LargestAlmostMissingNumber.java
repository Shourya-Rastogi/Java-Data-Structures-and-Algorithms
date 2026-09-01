package LeetcodePractice;

public class LargestAlmostMissingNumber {
    static int almostMissingNumber(int[] nums,int k){
        int n=nums.length;
        if(k==n){
            int max = nums[0];

            // Iterate through the array starting from the second element
            for (int i = 1; i < n; i++) {
                if (nums[i] > max) {
                    max = nums[i]; // Update max
                }
            }
            return max;
        }
        int[] freq=new int[51];
        for (int num : nums) {
            ++freq[num];
        }
        if(k==1){
            int max=Integer.MIN_VALUE;
            for (int num : nums) {
                if (num > max && freq[num] == 1) max = num;
            }
            return max;
        }

        if(freq[nums[0]]==1 && freq[nums[n-1]]==1) return Integer.max(nums[0],nums[n-1]);
        else if(freq[nums[0]]==1) return nums[0];
        else if(freq[nums[n-1]]==1) return nums[n-1];
        return -1;
    }
}
