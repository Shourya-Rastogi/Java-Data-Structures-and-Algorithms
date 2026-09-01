package BasicMaths;

import java.util.Scanner;

public class CountDigits {
    private int bruteforce(int n){
        int count =0;
        if(n==0) return 1;
        else{
            while (n != 0) {
                count++;
                n/=10;
            }
        }
        return count;
    }
    private int optimal(int n){
        int count= (int) (Math.log10(n)+1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        CountDigits cd=new CountDigits();
        int cn=cd.optimal(n);
        System.out.println(cn);

    }
}
