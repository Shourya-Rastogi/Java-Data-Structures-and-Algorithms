package SlidingWindownAndTwoPointers.Medium;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    static int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int max=0;
        int l=0;
        int r=0;
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            max=Math.max(max,r-l+1);
            hash[s.charAt(r)]=r++;
        }
        return max;
    }

    static void main() {
        String s="cadbzabcd";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
