package ArrayDSA.Easy;

public class LeftRotateArray {
    private static void rotateArray(int[] arr,int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        rotateArray(nums,nums.length);
        for(int num:nums){
            System.out.println(num);
        }
    }

}
