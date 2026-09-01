package ArrayDSA.Easy;

public class LargestElement {
    private static int largest(int[] arr,int n){
        int max=arr[0];
        for(int i=1;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={0,2,7,4,9,3,6,8};
        int n=arr.length;
        int lar=largest(arr,n);
        System.out.println(lar);

    }

}
