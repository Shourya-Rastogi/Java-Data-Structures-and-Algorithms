package ArrayDSA.Medium;

public class SetMatrixZero {
    //Time Complexity :cubic
    static int[][] bruteforce(int[][] nums,int n,int m){
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    //markrow(i)
                    for (int k=0;k<m;k++){
                        if (nums[i][k]!=0) nums[i][k]=-1;
                    }
                    //markcol(j);
                    for(int k=0;k<n;k++){
                        if(nums[k][j]!=0) nums[k][j]=-1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                if(nums[i][j]==-1) nums[i][j]=0;
            }
        }
        return nums;
    }
    //Time complexity:O(2*n*m) Space complexity:O(n+m)
    static int[][] better(int[][] nums ,int n, int m){
        int[] col=new int[m];
        int[] row=new int[n];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    row[i]=1;
                    col[i]=1;
                }
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    nums[i][j]=0;
                }
            }
        }
        return nums;
    }
    //Time complexity:O(2*n*m+n+m) Space complexity:O(1)
    static int[][] optimal(int[][] nums ,int n, int m){
        //int[] col=new int[m]; --> nums[0][...]
        //int[] row=new int[n]; ---> nums[...][0]
        int col0=1;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    nums[i][0]=0;
                    if(j!=0) nums[0][j]=0;
                    else col0=0;
                }
            }
        }
        for (int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(nums[i][j]!=0){
                    if(nums[0][j]==0 || nums[i][0]==0) nums[i][j]=0;
                }
            }
        }
        if(nums[0][0]==0){
            for(int j=0;j<m;j++){
                nums[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                nums[i][0]=0;
            }
        }
        return nums;
    }

    static int[][] optimal1(int[][] nums ){
        int n=nums.length;
        int m=nums[0].length;
        //int[] col=new int[m]; --> nums[0][...]
        //int[] row=new int[n]; ---> nums[...][0]
        int col0=1;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    nums[i][0]=0;
                    if(j!=0) nums[0][j]=0;
                    else col0=0;
                }
            }
        }
        for (int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(nums[i][j]!=0){
                    if(nums[0][j]==0 || nums[i][0]==0) nums[i][j]=0;
                }
            }
        }
        if(nums[0][0]==0){
            for(int j=0;j<m;j++){
                nums[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                nums[i][0]=0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[][] nums={
                {1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {0,1,1,1}
        };
        int[][] ans = optimal1(nums);
        for (int[] i:ans){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
