package StackAndQueues.PrefixInfixPostfixConversions;

import java.util.Stack;

public class PostfixToPrefix {
    String postfixToPrefix(String s){
        int i=0;
        Stack<String> st=new Stack<>();
        while(i<s.length()){
            if(Character.isAlphabetic(s.charAt(i))) st.push(String.valueOf(s.charAt(i)));
            else{
                String t1=st.pop();
                String t2=st.pop();
                st.push(s.charAt(i)+t2+t1);
            }
            i++;
        }
        return st.peek();
    }
}
