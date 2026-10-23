package GreedyAlgorithms.Hard;

public class ValidParenthesisString {
    boolean isValid(String s){
        int min=0;
        int max=0;
        char[] arr=s.toCharArray();
        for (char c : arr) {
            if (c == '(') {
                min++;
                max++;
            } else if (c == ')') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }
            if (min < 0) min = 0;
            if (max < 0) return false;
        }
        return min==0;
    }
}
