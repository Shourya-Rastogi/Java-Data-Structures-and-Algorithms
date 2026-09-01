package BasicMaths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisors {
    private List<Integer> getDivisors(int n){
        List<Integer> div=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                div.add(i);

                if(i!=n/i){
                    div.add(n/i);
                }
            }

        }

        return div;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> divisors =new ArrayList<>();
        Divisors divisor=new Divisors();
        divisors=divisor.getDivisors(n);
        for(int i:divisors){
            System.out.println(i);
        }
    }
}
