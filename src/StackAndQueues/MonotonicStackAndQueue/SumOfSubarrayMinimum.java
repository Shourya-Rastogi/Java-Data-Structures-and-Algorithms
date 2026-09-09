package StackAndQueues.MonotonicStackAndQueue;

import java.util.Stack;

public class SumOfSubarrayMinimum {
    static int[] findNSE(int[] nums){
        int n=nums.length;
        int[] nsn=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]) st.pop();
            nsn[i]=(st.isEmpty()) ? n : st.peek();
            st.push(i);
        }
        return nsn;
    }

    static int[] findPSEE(int[] nums){
        int n=nums.length;
        int[] psee=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]) st.pop();
            psee[i]=(st.isEmpty()) ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }

    static int sum(int[] nums){
        int[] nse=findNSE(nums);
        int[] psee=findPSEE(nums);
        int total=0;
        int mod= (int)(1e9+7);
        for(int i=0;i<nums.length;i++){
            int left=i-psee[i];
            int right=nse[i]-i;
            long freq = left * right * 1L;
            int val = (int)((freq * nums[i]) % mod);
            total=(total+val)%mod;
        }
        return total;
    }

    static void main() {
        int[] arr={1,4,6,7,3,7,8,1};
        System.out.println(sum(arr));
    }
}
