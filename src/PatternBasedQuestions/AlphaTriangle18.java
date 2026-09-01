package PatternBasedQuestions;

import java.util.Scanner;

public class AlphaTriangle18 {
    public void pattern18(int n){
        for(int i =0;i<n;i++){
            char ch =(char)('A'+n-i-1);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        AlphaTriangle18 p =new AlphaTriangle18();
        p.pattern18(n);
    }
}
