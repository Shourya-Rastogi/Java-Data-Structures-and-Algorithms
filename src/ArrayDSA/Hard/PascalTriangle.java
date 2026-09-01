package ArrayDSA.Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static int nCr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    //Return element at given (Row,Column)
    static int returnvalue(int row,int col){
        return nCr(row-1,col-1);
     }
     //Print any nth row
    static List<Integer> returnRow(int n){
        int ans=1;
        List<Integer> row=new ArrayList<>();
        row.add(ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            row.add(ans);
        }
        return row;
    }
    //Print Pascal's Triangle
    static List<List<Integer>> printtriangle(int n){
        List<List<Integer>> triangle=new ArrayList<>();
        for(int j=1;j<=n;j++){
            triangle.add(returnRow(j));
        }
        return triangle;
    }

    public static void main(String[] args) {
        //System.out.println(returnvalue(6,4));
        //printRow(6);
        printtriangle(6);
    }
}
