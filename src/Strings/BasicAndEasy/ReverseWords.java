package Strings.BasicAndEasy;

public class ReverseWords {
    static String reverse(String s){
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        for(int i=0;i<n;i++){
            StringBuilder word=new StringBuilder();
            while(str.charAt(i)!=' ' && i<n){
                word.append(str.charAt(i++));
            }
            word.reverse();
            if(!word.isEmpty()){
                if(!ans.isEmpty()) ans.append(' ');
                ans.append(word);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("the sky is blue"));
    }

}
