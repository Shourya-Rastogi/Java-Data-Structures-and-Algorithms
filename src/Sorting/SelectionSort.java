package Sorting;

public class SelectionSort {
    private void sort(int[] arr,int n){
        for(int i=0;i<=n-2;i++ ){
            int min =i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]< arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] nums={12,9,20,46,53,1,5};
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.sort(nums,7);
        for(int num :nums){
            System.out.print(num+" ");
        }
    }
}
