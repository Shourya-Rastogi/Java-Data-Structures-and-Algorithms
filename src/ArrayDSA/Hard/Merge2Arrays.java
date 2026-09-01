package ArrayDSA.Hard;

import java.util.Arrays;

public class Merge2Arrays {
    static void bruteforce(int[] arr1,int[] arr2){
        int n= arr1.length;
        int m= arr2.length;
        int[] arr=new int[n+m];
        int left=0;
        int right=0;
        int index=0;
        while(left<n && right<m){
            if(arr1[left]<arr2[right]){
                arr[index++]=arr1[left++];
            }
            else{
                arr[index++]=arr2[right++];
            }
        }
        while(left<n){
            arr[index++]=arr1[left++];
        }
        while(right<m){
            arr[index++]=arr1[right++];
        }

        for(int i=0;i<n+m;i++){
            if(i<n) arr1[i]=arr[i];
            else arr2[n-i]=arr[i];
        }
    }
    static void optimal1(int[] arr1,int[] arr2){
        int n= arr1.length;
        int m= arr2.length;
        int left=n-1;
        int right=0;
        while(left>=0 &&right<m){
            if (arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    static void optimal2(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int len= n+m;
        int gap= (len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                //arr1 and arr2
                if(left< n &&right>= n){
                    if(arr1[left]>arr2[right- n]){
                        int temp=arr1[left];
                        arr1[left]=arr2[right- n];
                        arr2[right-n]=temp;
                    }
                } else if (left>= n) {
                    if(arr1[left- n]>arr2[right- n]){
                        int temp=arr1[left- n];
                        arr1[left- n]=arr2[right-n];
                        arr2[right-n]=temp;
                    }
                } else {
                    if(arr1[left]>arr2[right]){
                        int temp=arr1[left];
                        arr1[left]=arr2[right];
                        arr2[right]=temp;
                    }
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        optimal1(arr1, arr2);
    }
}
