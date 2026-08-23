class Solution {

    private boolean isPossible(int[] nums, int k, long mid) {

        int subarrays = 1;
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (sum + nums[i] <= mid) {
                sum += nums[i];
            } 
            else {
                subarrays++;
                sum = nums[i];
            }

            if (subarrays > k) {
                return false;
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        long start = 0;
        long end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        long ans = -1;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (isPossible(nums, k, mid)) {
                ans = mid;
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return (int) ans;
    }
}