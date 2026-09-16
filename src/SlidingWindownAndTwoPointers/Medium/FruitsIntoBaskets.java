package SlidingWindownAndTwoPointers.Medium;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    static int maxFruits(int[] fruits){
        int l=0;
        int r=0;
        int maxlen=0;
        Map<Integer,Integer> mpp =new HashMap<>();
        while(r<fruits.length){
            mpp.put(fruits[r],mpp.getOrDefault(fruits[r],0)+1);
            if(mpp.size()>2){
                mpp.put(fruits[l],mpp.get(fruits[l])-1);
                if(mpp.get(fruits[l])==0) mpp.remove(fruits[l]);
                l++;
            }
            if(mpp.size()<=2) maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }

    static void main(String[] args) {
        int[] fruits={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(maxFruits(fruits));
    }
}
