package PatternBasedQuestions;

import java.util.Scanner;

public class IncreasingnumberTriangle13 {
    public void pattern13(int n){
        int num=1;
        for (int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        IncreasingnumberTriangle13 p =new IncreasingnumberTriangle13();
        p.pattern13(n);
    }
}
