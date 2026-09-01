package PatternBasedQuestions;

import java.util.Scanner;

public class AlphaHill17 {
    public void pattern17(int n){
        for (int i=0;i<=n-1;i++){
            char alpha=(char)('A'+i);
            for (int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for (int j=0;j<2*i+1;j++){
                if(j<breakpoint) System.out.print(ch++);
                else System.out.print(ch--);
            }
            for (int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        AlphaHill17 p=new AlphaHill17();
        p.pattern17(n);
    }
}
