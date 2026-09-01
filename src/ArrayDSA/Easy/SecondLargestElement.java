package ArrayDSA.Easy;

public class SecondLargestElement {
    private static int secondLargest(int[] arr,int n){
        int largest=Integer.MIN_VALUE;
        int seclargest=Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>seclargest){
                seclargest=arr[i];
            }
        }
        return seclargest;

    }
    public static void main(String[] args) {
        int[] arr={0,2,7,4,9,3,6,8};
        int n=arr.length;
        int secondLargest=secondLargest(arr,n);
        System.out.println(secondLargest);

    }
}
