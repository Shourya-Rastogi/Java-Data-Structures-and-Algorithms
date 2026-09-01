package PatternBasedQuestions;

import java.util.Scanner;

public class ReverseCharacterTriangle15 {
    public void pattern15(int n){
        for (int i=n;i>=1;i--){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ReverseCharacterTriangle15 p=new ReverseCharacterTriangle15();
        p.pattern15(n);
    }
}
