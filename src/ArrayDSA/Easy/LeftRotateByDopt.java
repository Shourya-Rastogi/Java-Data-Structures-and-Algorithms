package ArrayDSA.Easy;

public class LeftRotateByDopt {
    static void reverse(int[] arr,int start,int end){
        int l=start;
        int r=end;
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    static int[] leftRotate(int[] arr, int n,int d){
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        int[] a1 = leftRotate(a, 8, 3);
        for(int i:a1){
            System.out.print(i+" ");
        }
    }
}
