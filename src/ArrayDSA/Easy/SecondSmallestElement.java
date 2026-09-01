package ArrayDSA.Easy;

public class SecondSmallestElement {
    private static int secondSmallest(int[] arr,int n){
        int smallest=Integer.MAX_VALUE;
        int secSmallest=Integer.MAX_VALUE;
        for(int i=0;i<=n-1;i++){
            if(arr[i]<smallest){
                secSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secSmallest){
                secSmallest=arr[i];
            }
        }
        return secSmallest;

    }
    public static void main(String[] args) {
        int[] arr={0,2,7,4,9,3,6,8};
        int n=arr.length;
        int secondLargest=secondSmallest(arr,n);
        System.out.println(secondLargest);

    }
}
