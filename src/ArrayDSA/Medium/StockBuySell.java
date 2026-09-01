package ArrayDSA.Medium;

public class StockBuySell {
    static int maxprofit(int[] prices){
        int mincost=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(price<mincost) mincost=price;
            else maxprofit=Math.max(maxprofit,price-mincost);
        }
        return maxprofit;
    }

}
