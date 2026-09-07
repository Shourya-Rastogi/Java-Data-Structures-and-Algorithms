package StackAndQueues.MonotonicStackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    int[] findNGE(int[] nums1,int[] nums2){
        int n=nums2.length;
        Map<Integer,Integer> nge=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int[] res=new int[nums1.length];
        for(int i=n-1;i>=0;i-- ){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }
            if(st.empty()){
                nge.put(nums2[i],-1);
            }
            else{
                nge.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=nge.get(nums1[i]);
        }
        return res;
    }
}
