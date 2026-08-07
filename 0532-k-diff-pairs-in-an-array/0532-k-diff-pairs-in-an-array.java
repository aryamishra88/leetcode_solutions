class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        if(k<0){
            return 0;

        }
        int i=0;
        int j=1;
        int pairs=0;
        int n=nums.length;
        while(j<n){
            if(i==j||nums[j]-nums[i]<k){
                j++;
            }
            else if(nums[j]-nums[i]>k){
                i++;
            }else {
                pairs++;
                i++;
                j++;
                while(j<n&&nums[j]==nums[j-1]){
                    j++;
                }
            }

        }
        return pairs;
    }
}