package LeetcodePractice;

public class GCDofOddandEvenSums {
    static int gcd(int a,int b){
        while (a>0&&b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        else return a;
    }
    static int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        //Calculate SumOdd
        for(int i=1;i<=2*n-1;i+=2){
            sumOdd=sumOdd+i;
            sumEven=sumEven+i+1;
        }
        return gcd(sumOdd, sumEven);
    }

    public static void main(String[] args) {
        int gcd = gcdOfOddEvenSums(4);
        System.out.println(gcd);
    }
}
