package PatternBasedQuestions;

import java.util.Scanner;

public class CharacterTriangle14 {
    public void pattern14(int n){
        for (int i=0;i<=n-1;i++){
            for (char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CharacterTriangle14 p = new CharacterTriangle14();
        p.pattern14(n);
    }
}
