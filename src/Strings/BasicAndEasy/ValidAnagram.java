package Strings.BasicAndEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidAnagram {
    static boolean isAnagram(String s,String t){
        // Base case
        if(s.length() != t.length()) return false;

        char sArr[]=s.toCharArray(); // convert string to character array
        Arrays.sort(sArr); // sort the array
        String sortedS=new String(sArr); // then convert back the array into string

        char tArr[]=t.toCharArray();
        Arrays.sort(tArr);
        String sortedT=new String(tArr);

        if(sortedS.equals(sortedT)) return true;

        return false;
    }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
