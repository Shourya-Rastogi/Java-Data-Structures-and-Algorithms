package LeetcodePractice;

public class GCDOfArray {
    int gcd(int a,int b){
        while (a>0&&b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        else return a;
    }

    int findGCD(int[] nums){
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large) large=nums[i];
            if(nums[i]<small) small=nums[i];
        }
        return gcd(small,large);
    }

    public static void main(String[] args) {

    }
}
