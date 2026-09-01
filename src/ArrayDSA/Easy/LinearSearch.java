package ArrayDSA.Easy;

public class LinearSearch {
    static int search(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,2,5,1,6,7,3};
        int index = search(arr, 1);
        System.out.println(index);
    }
}
