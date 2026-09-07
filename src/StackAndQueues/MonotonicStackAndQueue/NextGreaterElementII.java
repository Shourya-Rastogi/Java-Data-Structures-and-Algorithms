package StackAndQueues.MonotonicStackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {
    int[] findNGE(int[] nums){
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[nums.length];
        for(int i=2*n-1;i>=0;i-- ){
            while(!st.isEmpty() && nums[i%n]>=st.peek()){
                st.pop();
            }
            if(i<n ){
                nge[i]=(st.isEmpty()) ? -1 :st.peek();
            }
            st.push(nums[i]);
        }
        return nge;
    }
}
