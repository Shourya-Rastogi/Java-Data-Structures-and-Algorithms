package Strings.BasicAndEasy;

public class RemoveOutermostParantheses {
    static String remove(String str){
        int count=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{') {
                count++;
                if(count==1) continue;
                ans.append(str.charAt(i));
            }
            else if(str.charAt(i)=='}') {
                count--;
                if(count==0) continue;
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    static String remove1(String s){
        int count=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='}') count--;
            if(count!=0) ans.append(s.charAt(i));
            if(s.charAt(i)=='{') count++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str="{{}{}{}}{{}{}}";
        String remove = remove(str);
        System.out.println(remove);
    }
}
