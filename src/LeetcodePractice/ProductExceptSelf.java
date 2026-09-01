package LeetcodePractice;

public class ProductExceptSelf {
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int pre = 1;

        for(int i = 0; i < n; i++){
            res[i] = pre;
            pre *= nums[i];
        }

        int suf = 1;

        for(int i = n - 1; i >= 0; i--){
            res[i] *= suf;
            suf *= nums[i];
        }

        return res;
    }

    static void main() {
        int[] arr={1,2,3,4};
        for (int i : productExceptSelf(arr)) {
            System.out.print(i+" ");
        }

    }
}
