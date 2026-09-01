package ArrayDSA.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    static List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> ans=new ArrayList<>();
        nums= Arrays.stream(nums).sorted().toArray();
        for(int i=0;i< nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for (int j=i+1;j<nums.length;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l= nums.length-1;
                while(k<l){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    } else if (sum<target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1000000000,1000000000,1000000000,1000000000};
        for (List<Integer> integers : fourSum(nums,-294967296)) {
            for (Integer i:integers){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
