package SlidingWindownAndTwoPointers.Medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringAtmostKDistinctCharacters {
    static int longestSubstringK(String s,int k){
        int maxlen=0;
        int l=0;
        int r=0;
        Map<Character,Integer> mpp=new HashMap<>();
        while(r<s.length()){
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
            while(mpp.size()>k){
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
                if(mpp.get(s.charAt(l))==0) mpp.remove(s.charAt(l));
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }

    static void main() {
        String s="aaabbccd";
        int k=2;
        System.out.println(longestSubstringK(s,k));
    }
}
