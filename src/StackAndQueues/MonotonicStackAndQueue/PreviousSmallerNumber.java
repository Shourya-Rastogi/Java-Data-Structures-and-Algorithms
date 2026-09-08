package StackAndQueues.MonotonicStackAndQueue;

import java.util.Stack;

public class PreviousSmallerNumber {
    int[] findPSN(int[] nums){
        int n=nums.length;
        int[] psn=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=nums[i]) st.pop();
            psn[i]=(st.isEmpty()) ? -1 : st.peek();
            st.push(nums[i]);
        }
        return psn;
    }
}
