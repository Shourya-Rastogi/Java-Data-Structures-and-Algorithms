package Recursion.GetAStrongHold;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        // Start generating subsets from index 0
        backtrack(0, temp, nums, ans);

        return ans;
    }
    public void backtrack(int i, List<Integer> temp, int[] nums,List<List<Integer>> ans) {
        int n = nums.length;

        if(i >= n) {
            // Current subset is complete
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Choice 1: Include the current element
        temp.add(nums[i]);
        backtrack(i + 1, temp, nums, ans);

        // Backtrack and remove the current element
        temp.remove(temp.size() - 1);

        // Choice 2: Exclude the current element
        backtrack(i + 1, temp, nums, ans);
    }
}
