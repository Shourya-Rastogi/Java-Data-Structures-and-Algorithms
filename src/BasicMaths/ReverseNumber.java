package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    private int reversenumber(int n){
        int rev=0;
        int temp=n;
        while(temp>0){
            int last=temp%10;
            rev=rev*10+last;
            temp/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ReverseNumber reverseNumber=new ReverseNumber();
        int reversed=reverseNumber.reversenumber(n);
        System.out.println(reversed);
    }

}
