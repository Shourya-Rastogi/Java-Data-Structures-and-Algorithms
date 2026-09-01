package BinarySearch.BinarySearchOnSearchSpace;

public class LeastCapacityToShipPackages {
    static int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(weights[i]>low) low=weights[i];
            high+=weights[i];
        }
        while(low<=high){
            int cap=low+(high-low)/2;
            int day=1;
            int load=0;
            for(int i=0;i<n;i++){
                if(load+weights[i]>cap){
                    day++;
                    load=weights[i];
                }
                else load+=weights[i];
            }
            if(day<=days) high=cap-1;
            else low=cap+1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days = shipWithinDays(weights, 5);
        System.out.println(days);
    }
}
