package BasicMaths;

import java.util.Scanner;

public class isNumberPrime {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        for(int i =0;i<t;i++){
            int n=sc.nextInt();
            int fc=0;
            for(int j=2;j*j<=n;j++){
                if(n%j==0){
                    fc++;
                    break;
                }
            }
            if(fc==0){
                System.out.println(n+" is Prime");
            } else{
                System.out.println(n+" is not Prime.");
            }
        }
    }
}
