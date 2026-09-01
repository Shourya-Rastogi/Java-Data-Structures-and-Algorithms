package BasicMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    private void armstrong(int n){
        int ln=String.valueOf(n).length();
        int sum=0;
        int temp= n;
        while(temp>0){
            int last=temp%10;
            sum= (int) (sum+Math.pow(last,ln));
            temp/=10;
        }
        if(sum==n) System.out.println("Armstrong number");
        else System.out.println("Not a Armstrong Number");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArmstrongNumber armstrongNumber=new ArmstrongNumber();
        armstrongNumber.armstrong(n);
    }
}
