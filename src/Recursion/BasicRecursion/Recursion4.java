package Recursion.BasicRecursion;

public class Recursion4 {
    private int fib(int n){
        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Recursion4 recursion =new Recursion4();
        System.out.println(recursion.fib(8));
    }
}
