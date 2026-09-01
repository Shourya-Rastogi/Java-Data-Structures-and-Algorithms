package BinarySearch.BinarySearchOnSearchSpace;

public class SmallestDivisorToGivenThreshold {
    int smallestDivisor(int[] nums, int threshold) {
        int lower = 1, upper = 0;
        for(int i=0;i<nums.length;i++){
            upper = nums[i]>upper?nums[i]:upper;
        }
        while(lower<=upper){
            int divisor = (lower)+(upper-lower)/2, temp =0;
            for(int i=0;i<nums.length;i++){
                temp+=(nums[i] + divisor - 1) / divisor;
            }
            if(temp>threshold){
                lower = ++divisor;
            }
            else{
                upper = --divisor;
            }
        }
        return lower;
    }
}
