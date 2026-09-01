package ArrayDSA.Medium;


//Sort array of 0's , 1's, 2's
public class SortArray {
    static void bruteforce(int[] nums){
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeros++;
            else if (nums[i]==1) {
                ones++;
            }
            else twos++;
        }
        for (int i=0;i< nums.length;i++){
            if(i<zeros) nums[i]=0;
            else if (i<zeros+ones ) nums[i]=1;
            else nums[i]=2;
        }
    }
    //Dutch Flag Algorithm
    static void optimal(int[] nums){
        int low=0;
        int mid=0;
        int high= nums.length-1;
        while(mid<=high){
            if (nums[mid] == 0) {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1) mid++;
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr={1,0,2,1,1,0,0,2,1};
        optimal(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
