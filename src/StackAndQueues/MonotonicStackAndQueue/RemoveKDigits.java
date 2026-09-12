package StackAndQueues.MonotonicStackAndQueue;

import java.util.Stack;

public class RemoveKDigits {
    String removeK(String s,int k){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            while(!st.empty() && k>0 && (st.peek()-'0')>(s.charAt(i)-'0')){
                st.pop();
                --k;
            }
            st.push(s.charAt(i));
        }
        while(k>0){
            st.pop();
            --k;
        }
        if(st.isEmpty()) return "0";
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        while(!res.isEmpty() && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        if(res.isEmpty()) return "0";
        return res.toString();
    }
}
