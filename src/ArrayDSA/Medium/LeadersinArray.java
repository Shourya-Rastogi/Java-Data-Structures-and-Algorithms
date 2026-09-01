package ArrayDSA.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersinArray {
    static ArrayList<Integer> leaders(int[] nums){
        int maxi=Integer.MIN_VALUE;
        int n= nums.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i= n-1; i>=0;i--){
            if(nums[i]>maxi){
                ans.add(nums[i]);
            }
            maxi=Math.max(maxi,nums[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={10,22,12,3,0,6};
        ArrayList<Integer> leaders = leaders(nums);
        for (int i:leaders){
            System.out.print(i+" ");
        }
    }
}
