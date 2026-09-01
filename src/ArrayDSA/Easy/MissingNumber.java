package ArrayDSA.Easy;

public class MissingNumber {
    //Brute Force Approach:Linear Search
    static int sol1(int[] nums){
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }
    //Better Solution :Hashing
    static int sol2(int[] nums){
        int n= nums.length;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]=1;
        }
        for (int i=0;i<=n;i++){
            if(hash[i]==0) return i;
        }
        return -1;
    }

    //Optimal Solution 1:Sum
    static int sol3(int[] nums){
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=nums[i];
        }
        return totalSum-sum;
    }

    //Optimal Solution 2: XOR
    static int sol4(int[] nums){
        int n= nums.length;
        int xor1=0;
        int xor2=0;
        for(int i=0;i<=n-1;i++){
            xor1=xor1^(i+1);
            xor2=xor2^nums[i];
        }
        return xor1^xor2;
    }

    //Optimal Solution 2: XOR Simplified
    static int sol5(int[] nums){
        int n= nums.length;
        int xor=0;
        for(int i=0;i<=n-1;i++){
            xor=xor^(i+1)^nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,4,5};
        int ans1=sol1(arr);
        System.out.println(ans1);
        int ans2=sol2(arr);
        System.out.println(ans2);
        int ans3=sol3(arr);
        System.out.println(ans3);
        int ans4=sol4(arr);
        System.out.println(ans4);
        int ans5=sol5(arr);
        System.out.println(ans5);
    }

}
