package Recursion.SubsequencePatterns;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    List<String> generateParantheses(int n){
        List<String> res=new ArrayList<>();
        backtrack("",0,0,n,res);
        return res;
    }

    void backtrack(String curr,int open,int close,int n,List<String> res){
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }
        if(open<n) backtrack(curr+"(",open+1,close,n,res);
        if(close<open) backtrack(curr+")",open,close+1,n,res);
    }
}
