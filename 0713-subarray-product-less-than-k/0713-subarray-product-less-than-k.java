class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int p = 1;

        int n = nums.length;
        while (j < n) {

            p *= nums[j];
            while (p >= k && i <= j) {
                p /= nums[i];
                i++;
            }
            count += (j - i + 1);
            j++;

        }
        return count;

    }
}