package BinarySearch.BinarySearchOnSearchSpace;

public class MinDaysToMakeBouquets {
    int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) return -1;
        int left = 1, right = 0;
        for (int d : bloomDay) right = Math.max(right, d);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int streak = 0;
        for (int d : bloomDay) {
            if (d <= day) {
                streak++;
                if (streak == k) {
                    bouquets++;
                    streak = 0;
                    if (bouquets >= m) return true;
                }
            } else {
                streak = 0;
            }
        }
        return bouquets >= m;
    }
}
