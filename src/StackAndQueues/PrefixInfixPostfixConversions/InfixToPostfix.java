package StackAndQueues.PrefixInfixPostfixConversions;

import java.util.Stack;

public class InfixToPostfix {
    int priority(Character ch){
        if(ch=='^') return 3;
        else if(ch=='*' || ch=='/') return 2;
        else if(ch=='+' || ch=='-') return 1;
        return -1;
    }
    String infixToPostfix(String s){
        int i=0;
        Stack<Character> stack=new Stack<>();
        StringBuilder ans= new StringBuilder();
        while(i<s.length()){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    ans.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && priority(s.charAt(i))<=priority(s.charAt(stack.peek()))){
                    ans.append(stack.pop());
                }
                stack.push(s.charAt(i));
            }
            i++;
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();
    }
}
