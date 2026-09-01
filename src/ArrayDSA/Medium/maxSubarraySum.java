package ArrayDSA.Medium;

public class maxSubarraySum {
    //Returns Maximum SubArray Sum
    static int optimal1(int[] nums){
        int sum=0;
        int n= nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            if(sum>maxi) maxi=sum;
            if(sum<0) sum=0;
        }
        if(maxi<0) maxi=0;
        return maxi;
    }
    //Returns subarray with maximum sum
    static int[] optimal2(int[] nums){
        int sum=0;
        int n= nums.length;
        int maxi=Integer.MIN_VALUE;
        int ansStart=-1;
        int ansEnd=-1;
        int start=-1;
        for(int i=0;i<n;i++){
            if(sum==0) start=i;
            sum=sum+nums[i];
            if(sum>maxi){
                maxi=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0) sum=0;
        }
        if(maxi<0) maxi=0;
        return new int[]{ansStart,ansEnd};
    }
    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        //int[] nums={-4,-2,-3,-1};
        //int ans = optimal1(nums);
        int[] ans = optimal2(nums);
        for (int i:ans){
            System.out.println(i);
        }
        //System.out.println(ans);

    }
}
