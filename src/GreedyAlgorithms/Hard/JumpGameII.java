package GreedyAlgorithms.Hard;

public class JumpGameII {
    int minJumps(int[] jumps){
        int tot=0,l=0,r=0;
        int n=jumps.length;
        while(r<n-1){
            int farthest=0;
            for(int ind=l;ind<r;ind++){
                farthest=Math.max(ind+jumps[ind],farthest);
            }
            l=r+1;
            tot++;
            r=farthest;
        }
        return tot;
    }
}
