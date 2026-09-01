package BasicMaths;

import java.util.Scanner;

public class PalindromeNumber {

    private void isPalindrome(int n){
        int rev=0;
        int temp=n;
        while(temp>0){
            int last=temp%10;
            rev=rev*10+last;
            temp/=10;
        }
        if(rev==n) System.out.println("Palindrome Number");
        else System.out.println("Not a Palindrome Number");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        int n=sc.nextInt();
        palindromeNumber.isPalindrome(n);
    }

}
