package Graph.Representation;

public class AdjacencyMatrix {

    static void main(String[] args) {
        int n=5,m=6;
        //1-based indexing
        int[][] adj=new int[n+1][n+1];
        //edge 1--2
        adj[1][2]=1;
        adj[2][1]=1;

        //edge 1--3
        adj[1][3]=1;
        adj[3][1]=1;

        //edge 2--4
        adj[2][4]=1;
        adj[4][2]=1;

        //edge 3--4
        adj[3][4]=1;
        adj[4][3]=1;

        //edge 2--5
        adj[2][5]=1;
        adj[5][2]=1;

        //edge 4--5
        adj[4][5]=1;
        adj[5][4]=1;

    }
}
