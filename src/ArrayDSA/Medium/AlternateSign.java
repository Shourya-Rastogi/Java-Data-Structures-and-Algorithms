package ArrayDSA.Medium;

import java.util.ArrayList;
import java.util.List;

public class AlternateSign {
    static int[] bruteforce(int[] arr){
        int n=arr.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        int posi=0;
        int negi=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else neg.add(arr[i]);
        }
        for (int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=pos.get(posi);
                posi++;
            }
            else {
                arr[i] = neg.get(negi);
                negi++;
            }
        }
        return arr;
    }

    static int[] optimal(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int i=0; i<n;i++){
            if(nums[i]<0){
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
        }
        return ans;
    }

    //Variant 2:Unequal number of positive and negative nums
    static int[] arrange(int[] nums){
        int n=nums.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        int posi=0;
        int negi=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }
            else neg.add(nums[i]);
        }
        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                nums[i*2]=pos.get(i);
                nums[i*2+1]=neg.get(i);
            }
            int index=2*neg.size();
            for(int i=neg.size();i<pos.size();i++){
                nums[index]=pos.get(i);
                index++;
            }
        }
        else {
            for(int i=0;i<pos.size();i++){
                nums[i*2]=pos.get(i);
                nums[i*2+1]=neg.get(i);
            }
            int index=2*pos.size();
            for(int i=pos.size();i<neg.size();i++){
                nums[index]=neg.get(i);
                index++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={1,2,-3,-1,-2,3,4,5};
        int[] nums1 = arrange(nums);
        for (int i: nums1) {
            System.out.print(i+" ");
        }
    }
}
