package Strings.Medium;

import java.util.HashMap;
import java.util.Map;

public class CountSubstringsKDistinctCharacters {
    static int atMostDistinct(String s,int k){
        int left=0;
        int res=0;

        Map<Character,Integer> freq=new HashMap<>();
        for(int right=0;right<s.length();right++){
            freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right),0));
            if(freq.size()>k){
                char leftChar=s.charAt(left);
                freq.put(leftChar,freq.get(leftChar)-1);
                if(freq.get(leftChar)==0) freq.remove(leftChar);
                left++;
            }
            res+=(right-left+1);
        }
        return res;
    }

    static int countSubstrings(String s,int k){
        return atMostDistinct(s,k)-atMostDistinct(s,k-1);
    }
}
