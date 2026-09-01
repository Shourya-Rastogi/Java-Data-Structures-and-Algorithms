package ArrayDSA.Easy;

public class SortedOrNot {
    private static boolean sorted(int[] arr,int n){
        boolean flag=true;
        for(int i=0;i<=n-2;i++){
            if(arr[i + 1] < arr[i]){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={0,2,4,6,7,8};
        int n=arr.length;
        boolean sorted=sorted(arr,n);
        System.out.println(sorted);


    }
}
