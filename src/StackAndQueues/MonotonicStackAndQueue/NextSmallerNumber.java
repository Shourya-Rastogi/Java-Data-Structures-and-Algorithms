package StackAndQueues.MonotonicStackAndQueue;
import java.util.*;

public class NextSmallerNumber {
    int[] findNSN(int[] nums){
        int n=nums.length;
        int[] nsn=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=nums[i]) st.pop();
            nsn[i]=(st.isEmpty()) ?-1 : st.peek();
            st.push(nums[i]);
        }
        return nsn;
    }
}
