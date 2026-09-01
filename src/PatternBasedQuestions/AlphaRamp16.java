package PatternBasedQuestions;

import java.util.Scanner;

public class AlphaRamp16 {
    public void pattern16(int n){
        char ch='A';
        for (int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        AlphaRamp16 p=new AlphaRamp16();
        p.pattern16(n);
    }
}
