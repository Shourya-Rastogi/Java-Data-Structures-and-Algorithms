package ArrayDSA.Easy;

public class NumAppearsOnlyOnce {
    static int func(int[] nums){
        int xor=0;
        for(int i : nums){
            xor=i^xor;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,5,5,8,8};
        int max=func(arr);
        System.out.println(max);
    }
}
