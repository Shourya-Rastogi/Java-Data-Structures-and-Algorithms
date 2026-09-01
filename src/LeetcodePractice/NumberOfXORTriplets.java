package LeetcodePractice;

public class NumberOfXORTriplets {
    static int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n==1 || n==2) return n;
        int ans=(int)(Math.log(n)/Math.log(2))+1;
        return (int) Math.pow(2,ans);
    }
    static int uniquexortriplets(int[] nums){
        int n=nums.length;
        if(n==1 || n==2) return n;
        int ans=1;
        while(ans<=n) ans*=2;
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        int ans=uniquexortriplets(nums);
        System.out.println(ans);
    }

}
