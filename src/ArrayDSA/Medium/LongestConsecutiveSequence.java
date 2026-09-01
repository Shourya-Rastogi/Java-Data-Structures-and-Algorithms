package ArrayDSA.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    static int longestconsecutivesequence(int[] nums){
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int i:st){
            if(!st.contains(i-1)){
                int cnt=1;
                int x=i;
                while(st.contains(x+1)){
                    cnt++;
                    x++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums={102,4,100,1,101,3,2};
        System.out.println(longestconsecutivesequence(nums));

    }

}
