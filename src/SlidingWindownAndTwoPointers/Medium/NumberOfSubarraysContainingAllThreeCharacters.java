package SlidingWindownAndTwoPointers.Medium;

public class NumberOfSubarraysContainingAllThreeCharacters {
    int numberOfSubarrays(String s){
        int[] lastseen={-1,-1,-1};
        int cnt=0;

        for(int i=0;i<s.length();i++){
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1){
                cnt+=Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]))+1;
            }
        }
        return cnt;
    }
}
