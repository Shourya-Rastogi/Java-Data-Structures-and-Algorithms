package Sorting;

public class InsertionSort {
    private void sort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={14,9,15,12,6,8,13};
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.sort(nums,7);
        for(int num :nums){
            System.out.print(num+" ");
        }
    }
}
