package ArrayDSA.Easy;

import static java.lang.Math.max;

public class MaxConsecutiveOnes {



    static int func(int[] arr){
        int n =arr.length;
        int count=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxi=max(count,maxi);
            }
            else count=0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,0,1,1,0,0};
        int max=func(arr);
        System.out.println(max);
    }
}
