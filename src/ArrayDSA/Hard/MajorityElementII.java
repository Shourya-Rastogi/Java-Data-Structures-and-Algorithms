package ArrayDSA.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Occurance Greater than Floor(n/3)
public class MajorityElementII {
    static List<Integer> majorityElement(int[] nums){
        int n= nums.length;
        List<Integer> ans=new ArrayList<>();
        int cnt1=0, cnt2 =0,el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt1==0 &&nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            } else if (cnt2==0 && nums[i]!= el1) {
                cnt2=1;
                el2=nums[i];
            } else if (el1==nums[i]) {
                cnt1++;
            }else if (el2==nums[i]) {
                cnt2++;
            }else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for (int i=0;i<n;i++){
            if(nums[i]==el1) cnt1++;
            if (nums[i]==el2) {
                cnt2++;
            }
        }
        int mini=(n/3);
        if(cnt1>mini) ans.add(el1);
        if (cnt2>mini && el1 != el2) ans.add(el2);
        //Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,2,2,2};
        for (int  i:majorityElement(arr)) System.out.println(i + " ");
    }
}
