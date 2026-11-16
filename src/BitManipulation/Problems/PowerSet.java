package BitManipulation.Problems;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    List<List<Integer>> powerSet(int[] nums){
        int n=nums.length;
        int subsets=1<<n;
        List<List<Integer>> ans=new ArrayList<>();
        for(int num=0;num<subsets;num++){
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num&(1<<i))!=0) sub.add(nums[i]);
            }
            ans.add(sub);
        }
        return ans;
    }
}
