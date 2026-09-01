package LeetcodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MissingNumbers {
    List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        int min=nums[0];
        int max=nums[nums.length-1];
        int i=0;
        while(i<nums.length){
            if(nums[i]==min){
                min=nums[i];
                i++;
            }
            else{
                ans.add(min);
            }
            min++;
        }
        return ans;

    }

    List<Integer> findMissingElements2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = 101;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            min = n<min ? n : min;
            max = n>max ? n : max;
            set.add(n);
        }
        for(int i = min+1; i < max; i++){
            if(!set.contains(i))
                list.add(i);
        }
        return list;

    }
}
