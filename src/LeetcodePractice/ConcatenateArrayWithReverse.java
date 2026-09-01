package LeetcodePractice;

public class ConcatenateArrayWithReverse {
    static int[] concatenate(int[] nums){
        int[] ans = new int[2 * nums.length];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        int index=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            index++;
            ans[index]=nums[i];
        }
        return ans;
    }

    static void main() {
        int[] arr={1,2,3};
        int[] concatenate = concatenate(arr);
        for (int i = 0; i < concatenate.length; i++) {
            System.out.println(concatenate[i]+" ");
        }
    }
}
