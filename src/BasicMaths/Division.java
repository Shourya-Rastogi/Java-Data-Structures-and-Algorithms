package BasicMaths;

import java.util.Scanner;
//INCOMPLETE
//NOT THE OPTIMAL APPROACH
public class Division {
    private int div(int dividend,int divisor){
        int res=0;
        if(dividend>=0 && divisor>0){
            while(dividend>=divisor){
                dividend=dividend-divisor;
                res++;
            }
            if(res>Integer.MAX_VALUE){
                res=Integer.MAX_VALUE;
            }
        }
        else if(dividend<0 && divisor>0){
            while(dividend<=-1*divisor){
                dividend=dividend+divisor;
                res++;
            }
            res=-1*res;
            if(res<Integer.MIN_VALUE){
                res=Integer.MIN_VALUE;
            }
        } else if (dividend>=0 && divisor<0) {
            while(dividend>=-1*divisor){
                dividend=dividend+divisor;
                res++;
            }
            res*=-1;
            if(res<Integer.MIN_VALUE){
                res=Integer.MIN_VALUE;
            }
        }
        else {
            while(dividend<=divisor){
                dividend=dividend-divisor;
                res++;
            }
            if(res>Integer.MAX_VALUE){
                res=Integer.MAX_VALUE;
            }
        }
        if(res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else if (res<Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        else return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Division division=new Division();
        System.out.println(division.div(a,b));
    }
}
