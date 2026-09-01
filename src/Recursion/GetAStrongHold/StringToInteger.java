package Recursion.GetAStrongHold;

public class StringToInteger {
    static int myAtoi(String s){
        int i=0;
        while(i<s.length() && s.charAt(i)==' ') i++;
        int sign=1;
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }
        return helper(s,i,0,-1);
    }

    static int helper(String s,int index,long num,int sign){
        if(index>=s.length() || !Character.isDigit(s.charAt(index))) return (int)(num*sign);
        num=num*10+(s.charAt(index)-'0');
        if(sign*num>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign*num<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return helper(s,index+1,num,sign);
    }
}
