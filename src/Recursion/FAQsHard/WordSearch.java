package Recursion.FAQsHard;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int n = board.length; int m = board[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (board[i][j] == word.charAt(0) && dfs(i, j, 0, board, word)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int row, int col, int index, char[][] board, String word){

        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '0';

        if (index == word.length() - 1 ||
                dfs(row-1, col, index+1, board, word) ||
                dfs(row, col-1, index+1, board, word) ||
                dfs(row+1, col, index+1, board, word) ||
                dfs(row, col+1, index+1, board, word)) {
            return true;
        }
        board[row][col] = temp;
        return false;
    }
}
