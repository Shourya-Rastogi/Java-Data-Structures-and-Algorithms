package LeetcodePractice;

public class NumberOfXorTripletsII {
    static int sol1(int[] nums){
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
        }
        int t=1;
        while(t<=max)t<<=1;
        boolean[] s1=new boolean[t];
        boolean[] s2=new boolean[t];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                s1[nums[i]^nums[j]]=true;
            }
        }
        int count=0;
        for(int i=0;i<=t;i++){
            if(s1[i]){
                for(int num:nums){
                    s2[i^num]=true;
                    count++;
                }
            }
        }

        return count;

    }
}
