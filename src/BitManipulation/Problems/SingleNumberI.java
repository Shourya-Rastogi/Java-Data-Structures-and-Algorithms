package BitManipulation.Problems;

public class SingleNumberI {
    int singleNumber(int[] nums){
        int xor=0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
