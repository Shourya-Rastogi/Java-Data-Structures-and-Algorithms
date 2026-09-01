package LeetcodePractice;

public class SmallestMissingIntGreaterThanSequentialPrefixSum {
    int missingInteger(int[] nums) {
        int prefix = nums[0];
        int j = 1;
        while (j < nums.length && nums[j] == nums[j - 1] + 1) {
            prefix += nums[j++];
        }
        int x = prefix;
        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == x) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return x;
            }

            x++;
        }
    }
}
