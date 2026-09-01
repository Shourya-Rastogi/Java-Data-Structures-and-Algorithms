package BasicMaths;

import java.util.Scanner;

public class PrimeNumber {
    private boolean isPrime(int n){
        int count=0;
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                count++;
               
            }
        }
        if(count==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrimeNumber primeNumber=new PrimeNumber();
        boolean res=primeNumber.isPrime(n);
        System.out.println(res);
    }
}
