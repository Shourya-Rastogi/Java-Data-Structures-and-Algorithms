package PatternBasedQuestions;

import java.util.Scanner;

public class Butterfly20 {
    public void pattern20(int n){
        for(int i=1;i<=2*n-1;i++){
            int breakpoint=n;
            if(i<=breakpoint){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for (int j=0;j<2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
                for(int j=0;j>2*(n-i);j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }


            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Butterfly20 p=new Butterfly20();
        p.pattern20(n);
    }
}
