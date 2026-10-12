package Recursion.FAQsMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    private void findCombinations(int ind,int[] ans,int target,List<List<Integer>> ansList,List<Integer> ds){
        if(target==0) {
            ansList.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<ans.length;i++){
            if(i>ind && ans[i]==ans[i-1]) continue;
            if(ans[i]>target) break;
            ds.add(ans[i]);
            findCombinations(i+1,ans,target-ans[i],ansList,ds);
            ds.removeLast();
        }
    }
}
