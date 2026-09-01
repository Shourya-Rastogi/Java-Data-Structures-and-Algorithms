package LeetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;

        k %= total;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(0);
            }

            ans.add(row);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int oldIndex = i * n + j;

                int newIndex = (oldIndex + k) % total;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                ans.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[][] grid={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Shift2DGrid shift2DGrid=new Shift2DGrid();
        List<List<Integer>> shiftedGrid = shift2DGrid.shiftGrid(grid, 1);
        for(List<Integer> list:shiftedGrid){
            System.out.println("{");
            for (int i:list){
                System.out.print(i+" ,");
            }
            System.out.println("}");
        }
    }
}
