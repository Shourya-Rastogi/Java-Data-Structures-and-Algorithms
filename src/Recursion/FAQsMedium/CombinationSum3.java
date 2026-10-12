package Recursion.FAQsMedium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    private void help(int i,int k,int sumTillNow,int n,List<Integer> subset,List<List<Integer>> ans){
        if(sumTillNow>n) return;
        if(k==0){
            if(sumTillNow==n) ans.add(new ArrayList<>(subset));
            return;
        }
        if(i==10) return;
        sumTillNow+=i;
        subset.add(i);
        help(i+1,k-1,sumTillNow,n,subset,ans);
        sumTillNow-=i;
        subset.removeLast();
        help(i+1,k,sumTillNow,n,subset,ans);
    }
    public List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> ans=new ArrayList<>();
        help(1,k,0,n,new ArrayList<>(),ans);
        return ans;
    }
}
