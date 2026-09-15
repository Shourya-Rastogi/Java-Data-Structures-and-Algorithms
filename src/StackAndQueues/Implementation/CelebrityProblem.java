package StackAndQueues.Implementation;

public class CelebrityProblem {
    int findCelebrity(int[][] matrix){
        int top=0;
        int down=matrix.length;
        while(top<down){
            if(matrix[top][down]==1) top++;
            else if(matrix[down][top]==1) down--;
            else{
                top--;
                down--;
            }
        }
        if(top>down) return -1;
        for(int i=0;i<matrix.length;i++){
            if(i==top) continue;
            if(matrix[top][i]==0&&matrix[i][top]==1) continue;
            else return -1;
        }
        return top;
    }
}
