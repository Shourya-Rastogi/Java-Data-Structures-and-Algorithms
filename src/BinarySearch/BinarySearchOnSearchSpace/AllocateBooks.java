package BinarySearch.BinarySearchOnSearchSpace;

public class AllocateBooks {
    int allocateBooks(int[] arr,int m){
        int n=arr.length;
        if(n<m) return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            high+=arr[i];
            if(low<arr[i]) low=arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int noStudents=countStudents(arr,mid);
            if(noStudents>m) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    int countStudents(int[] arr,int pages){
        int students=1;
        int pagesStudent=0;
        for(int i=0;i<arr.length;i++){
            if(pagesStudent+arr[i]<=pages) pagesStudent+=arr[i];
            else{
                students++;
                pagesStudent=arr[i];
            }
        }
        return students;
    }
}
