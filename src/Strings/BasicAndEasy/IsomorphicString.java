package Strings.BasicAndEasy;

import java.util.HashMap;

public class IsomorphicString {
    //Better Solution
    static boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;

    }

    static boolean isIsomorphic2(String s, String t) {
        HashMap<Character,Character> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) map.put(s.charAt(i),t.charAt(i));
            else return false;
        }

        return true;

    }

    public static void main(String[] args) {
        String s="badc";
        String t="baba";
        System.out.println(isIsomorphic2(s,t));
    }
}
