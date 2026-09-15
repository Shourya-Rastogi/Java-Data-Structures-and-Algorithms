package SlidingWindownAndTwoPointers.Medium;

public class MaxPointsYouCanObtainFromCards {
    static int maxScore(int[] cardPoints,int k){
        int lSum=0,rSum=0,maxSum=0;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
        }
        maxSum=lSum;
        int rIndex= cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[rIndex--];
            maxSum=Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }

    public int maxScore2(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int current = 0;

        // 1. Take all 'w' elements from the left side first
        for (int i = 0; i < k; i++) {
            current += cardPoints[i];
        }

        int maxx = current;

        // 2. Swap elements: remove from left end, add to right end
        // We do this 'w' times to check all combinations of left & right
        for (int i = 0; i < k; i++) {
            current = current - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];

            if (current > maxx) {
                maxx = current;
            }
        }

        return maxx;
    }

    static void main() {
        int[] cardPoints={6,2,3,4,7,2,1,7,1};
        System.out.println(maxScore(cardPoints,4));
    }
}
