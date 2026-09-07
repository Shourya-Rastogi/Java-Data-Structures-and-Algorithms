package StackAndQueues.PrefixInfixPostfixConversions;

import java.util.Stack;

public class PrefixToPostfix {
    String prefixToPostfix(String s){
        int i=s.length()-1;
        Stack<String> st=new Stack<>();
        while(i>=0){
            if(Character.isAlphabetic(s.charAt(i))) st.push(String.valueOf(s.charAt(i)));
            else{
                String t1=st.pop();
                String t2=st.pop();
                st.push(t1+t2+s.charAt(i));
            }
            i--;
        }
        return st.peek();
    }
}
