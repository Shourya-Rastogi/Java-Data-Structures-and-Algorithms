
package Recursion.FAQsMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        // Start generating subsets from index 0
        backtrack(0, temp, nums, ans);

        return ans;
    }
    public void backtrack(int ind, List<Integer> temp, int[] nums,List<List<Integer>> ans) {
        ans.add(temp);
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(i+1,temp,nums,ans);
            temp.removeLast();
        }
    }
}
