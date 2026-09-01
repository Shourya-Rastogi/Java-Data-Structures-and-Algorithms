package LeetcodePractice;

public class BuildArray {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    //O(1) space...we will store both nums in same location and later retrieve ans values
    public int[] buildArray1(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            nums[i] += (1024 * (nums[nums[i]] % 1024));

        for (int i = 0; i < nums.length; i++)
            nums[i] /= 1024;

        return nums;
    }
}