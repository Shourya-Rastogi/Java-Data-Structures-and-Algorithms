package Recursion.GetAStrongHold;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(0, temp, nums, ans);
        return ans;
    }
    public void backtrack(int i, List<Integer> temp, int[] nums,List<List<Integer>> ans) {
        int n = nums.length;
        if(i >= n) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        backtrack(i + 1, temp, nums, ans);
        temp.removeLast();
        backtrack(i + 1, temp, nums, ans);
    }
}
