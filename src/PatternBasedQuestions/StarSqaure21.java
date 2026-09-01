package PatternBasedQuestions;

import java.util.Scanner;

public class StarSqaure21 {
    public void pattern21(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        StarSqaure21 p=new StarSqaure21();
        p.pattern21(n);
    }
}
