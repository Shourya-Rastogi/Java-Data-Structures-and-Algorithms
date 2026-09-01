package ArrayDSA.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int better(int[] nums){
        int n= nums.length;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            Integer freq1 = freq.get(nums[i]);
            if(freq1==null) freq1=0;
            freq.put(nums[i],freq1+1);
        }
        for(Map.Entry<Integer,Integer> elem: freq.entrySet()){
            if(elem.getValue()>n/2) return elem.getKey();
        }
        return -1;
    }
    //Moose's voting Algorithm
    static int optimal(int[] nums){
        int n=nums.length;
        int count=0;
        int ele = 0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele=nums[i];
            }
            else if(nums[i]==ele) count++;
            else count--;
        }
        count=0;
        for(int i: nums){
            if(i==ele) count++;
        }
        if(count>(n/2)) return ele;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,1,1,1,1};
        int better = better(nums);
        System.out.println(better);

    }
}
