package LeetcodePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    static List<Integer> sequentialDigits(int low,int high){
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num=i;
            for (int j=i+1;j<=9;j++){
                num=num*10+j;
                if(num>=low&&num<=high)
                    res.add(num);
            }
        }
        Collections.sort(res);
        return res;
    }
}
