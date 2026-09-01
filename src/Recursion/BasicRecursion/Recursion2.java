package Recursion.BasicRecursion;

public class Recursion2 {
    private void sumofn(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumofn(i-1,sum+i);
    }

    private int sumofn1(int n){
        if(n==0 ) return 0;
        return n+ sumofn1(n-1);
    }
    private int factorial(int n){
        if(n==1 ) return 1;
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        Recursion2 recursion =new Recursion2();
        //recursion.sumofn(5,0);
        int sum = recursion.sumofn1(5);
        System.out.println(sum);
        int factorial = recursion.factorial(5);
        System.out.println(factorial);

    }
}
