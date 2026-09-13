package StackAndQueues.MonotonicStackAndQueue;
import java.util.*;
public class SlidingWindowMaximum {
    static int[] findmax(int[] nums, int k){
        Deque<Integer> dq = new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        int indx=0;
        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller values from the back of deque
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Add to result once the first window is formed
            if (i >= k - 1) {
                res[indx++] = nums[dq.peekFirst()];
            }
        }

        // Return result list
        return res;
    }

    static void main() {
        int[] arr={1,3,-1,5,3,2,1,6};
        int[] ans=findmax(arr,3);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
