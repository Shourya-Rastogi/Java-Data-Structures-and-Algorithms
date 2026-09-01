package Recursion.BasicRecursion;

public class Recursion1 {
    private void printName(String name,int n){
        if (n == 1) {
            return;

        }
        System.out.println(name);
        printName(name,n-1);
    }
    private void printnumbers(int a,int b){
        if(a>b){
            return;
        }
        System.out.println(a);
        printnumbers(++a,b);
    }
    private void printreversenumbers(int a,int b){
        if(a<b){
            return;
        }
        System.out.println(a);
        printreversenumbers(--a,b);
    }
    //USING BACKTRACKING
    private void printnumbers1(int a,int b){
        if(a>b){
            return;
        }
        printnumbers1(a,b-1);
        System.out.println(b);

    }
    //USING BACKTRACKING
    private void printreversenumbers1(int a,int b){
        if(a>b){
            return;
        }
        printreversenumbers1(a+1,b);
        System.out.println(a);

    }

    public static void main(String[] args) {
        Recursion1 recursion= new Recursion1();
        //recursion.printName("Shourya",10);
        //recursion.printnumbers(1,10);
        //recursion.printreversenumbers(10,1);
        //recursion.printnumbers1(1,10);
        recursion.printreversenumbers1(1,10);
    }
}
