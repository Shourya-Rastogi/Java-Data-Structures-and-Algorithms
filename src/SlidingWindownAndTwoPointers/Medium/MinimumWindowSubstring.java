package SlidingWindownAndTwoPointers.Medium;

public class MinimumWindowSubstring {
    static String minimumSubstring(String s,String t){
        int[] hash=new int[256];
        int n=s.length(), m=t.length(),l=0, r=0,minlen=Integer.MAX_VALUE, sIndex=-1,cnt=0,eIndex=-1;
        for(int i=0;i<m;i++) hash[t.charAt(i)]++;
        while(r<n){
            if(hash[s.charAt(r)]>0) cnt++;
            hash[s.charAt(r)]--;
            while(cnt==m){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    eIndex=r;
                    sIndex=l;
                }

                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0) cnt--;
                l++;
            }
            r++;
        }
        return (sIndex==-1)?"":s.substring(sIndex,eIndex+1);
    }

    static void main() {
        String s="ddaaabbca";
        String t="abc";
        System.out.println(minimumSubstring(s,t));
    }
}
