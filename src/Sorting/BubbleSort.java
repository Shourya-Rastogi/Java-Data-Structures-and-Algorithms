package Sorting;

public class BubbleSort {
    private void sort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int didswap=0;
            for(int j=0;j<=n-i-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1;
                }
            }
            if(didswap==0) break;

        }
    }

    public static void main(String[] args) {
        int[] nums={12,9,20,46,53,1,5};
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.sort(nums,7);
        for(int num :nums){
            System.out.print(num+" ");
        }
    }
}
