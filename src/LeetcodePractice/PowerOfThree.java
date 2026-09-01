package LeetcodePractice;

public class PowerOfThree {
//    static boolean isPowerOfThree(int n) {
//            if(n<=0){
//                return false;
//            }
//        double log=Math.log10(n)/Math.log10(3);
//        int logn=(int) log;
//        return logn == log;
//    }
    static boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }

    static void main() {
        System.out.println(isPowerOfThree(10));
    }
}
