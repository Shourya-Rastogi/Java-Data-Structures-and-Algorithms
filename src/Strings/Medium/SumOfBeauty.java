package Strings.Medium;

import com.sun.jdi.connect.Connector;

import java.util.HashMap;
import java.util.Map;

public class SumOfBeauty {
    static int sumOfBeauty(String s){
        int n = s.length();
        int ans =0;

        for(int i=0;i<n;i++){
            int[] freq = new int[26];

            for(int j=i;j<n;j++){

                char ch = s.charAt(j);
                freq[ch - 'a']++;
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for(int k=0;k<26;k++){
                    if(freq[k]==0) continue;

                    maxFreq = Math.max(maxFreq, freq[k]);
                    minFreq = Math.min(minFreq , freq[k]);
                }
                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
}
