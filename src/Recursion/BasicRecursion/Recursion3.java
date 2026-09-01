package Recursion.BasicRecursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Recursion3 {
    //USING left and right index
    private List<Integer> revarr(List<Integer> arr,int l,int r){
        if(l>=r) return arr;
        Collections.swap(arr,l,r);
        return revarr(arr,l+1,r-1);
    }
    //Using initial index and size of array
    private void revarr1(List<Integer> arr,int i,int n){
        if(i>=n/2) return ;
        Collections.swap(arr,i,n-i-1);
        revarr1(arr,i+1,n);
    }
    private boolean ispalindrome(String str,int i,int size){
        if(i>=size/2) return true;
        else if (str.charAt(size - i - 1) != str.charAt(i)) {
            return false;
        }
        return ispalindrome(str,i+1,size);
    }

    public static void main(String[] args) {
        Recursion3 recursion=new Recursion3();
        List<Integer> arr= Arrays.asList(1,3,4,5,8,6,7);
        recursion.revarr1(arr, 0, arr.size());
        //List<Integer> rev = recursion.revarr(arr, 0, 6);
//        for(int num:arr){
//            System.out.println(num);
//        }
        boolean palindrome=recursion.ispalindrome("MADAM",0,5);
        System.out.println(palindrome);
    }
}
