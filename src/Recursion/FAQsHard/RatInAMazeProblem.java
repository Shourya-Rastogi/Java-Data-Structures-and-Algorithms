package Recursion.FAQsHard;

import java.util.ArrayList;
import java.util.List;

public class RatInAMazeProblem {
    public static List<String> findPath(int[][] m, int n){
        List<String> ans=new ArrayList<>();
        if (n == 0 || m[0][0] == 0 || m[n - 1][n - 1] == 0) {
            return ans;
        }
        int[][] vis=new int[n][n];
        int[] di={1,0,0,-1};
        int[] dj={0,-1,1,0};
        solve(0,0,m,n,ans,new StringBuilder(),vis,di,dj);
        return ans;
    }
    static void solve(int i,int j,int[][] m,int n,List<String> ans,StringBuilder move, int[][] vis,int[] di,int[] dj){
        if(i==n-1 &&j==n-1) {
            ans.add(move.toString());
            return;
        }
        vis[i][j]=1;
        String dir="DLRU";
        for(int ind=0;ind <n;ind++){
            int nexti=i+di[ind];
            int nextj=j+dj[ind];
            if(nexti>=0 && nextj>=0 && nexti<n && nextj<n && vis[nexti][nextj]==0 && m[nexti][nextj]==1){
                move.append(dir.charAt(ind));
                solve(nexti, nextj, m, n, ans, move, vis, di, dj);
                move.deleteCharAt(move.length() - 1);
            }
        }
        vis[i][j]=0;
    }

    static void main() {
        int[][] maze={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int n=4;
        for (String s : findPath(maze, n)) {
            System.out.println(s+" ,");
        }

    }
}
