class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        long required = (long) m * k;

        // Not enough flowers
        if (required > bloomDay.length) {
            return -1;
        }

        int low = 1;
        int high = 0;

        // Find maximum bloom day
        for (int day : bloomDay) {
            high = Math.max(high, day);
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;   // try fewer days
            } else {
                low = mid + 1;    // need more days
            }
        }

        return ans;
    }

    public boolean canMake(int[] bloomDay, int m, int k, int day) {

        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}