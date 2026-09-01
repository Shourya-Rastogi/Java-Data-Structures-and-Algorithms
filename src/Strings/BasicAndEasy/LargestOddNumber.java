package Strings.BasicAndEasy;

public class LargestOddNumber {
    static String oddNumber(String num){
        int n=num.length();
        int lindex=-1;
        for(int j=0;j<n;j++){
            if(num.charAt(j)%2==1) lindex=j;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=n-1;i++){
            if(num.charAt(i)%2==1 || i<=lindex) sb.append(num.charAt(i));
        }
        return sb.toString();
    }

    static String Optimal(String num){
        int i = num.length() - 1;

        while(i >= 0 && num.charAt(i)%2 == 0) i--;

        if(i < 0 && num.charAt(0)%2 == 0) return "";

        return num.substring(0, i+1);
    }
}
