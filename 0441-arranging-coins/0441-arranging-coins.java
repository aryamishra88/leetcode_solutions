class Solution {
    public int arrangeCoins(int n) {
        int Start = 0, End = n;
        int ans = 0;

        while (Start <= End) {
            int mid = Start + (End - Start) / 2;

            long coins = (long) mid * (mid + 1) / 2;

            if (coins <= n) {
                ans = mid;
                Start = mid + 1;
            } else {
                End = mid - 1;
            }
        }

        return ans;
    }
}