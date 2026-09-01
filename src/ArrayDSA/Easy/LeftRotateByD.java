package ArrayDSA.Easy;

public class LeftRotateByD {
    static void leftRotate(int[] arr,int n,int d){
        d=d%n;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        leftRotate(nums,nums.length,1);
        for (int num:nums){
            System.out.print(num+" ");
        }
    }
}
