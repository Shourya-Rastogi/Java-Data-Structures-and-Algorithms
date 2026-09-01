package ArrayDSA.Easy;

public class removeDuplicates {
    private static int removeDuplicate(int[] arr,int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3,3,3,3,4};
        int size = removeDuplicate(nums, nums.length);
        for(int i=0;i<size;i++){
            System.out.println(nums[i]);
        }
    }
}
