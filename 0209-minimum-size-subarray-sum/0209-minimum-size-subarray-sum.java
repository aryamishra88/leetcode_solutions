class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;

        int sum=0;
        int len=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                int k=j-i+1;
                len=Math.min(len,k);
                sum-=nums[i];
                i++;

            }

        }
        if(len!=Integer.MAX_VALUE){
            return len;
        }
        return 0;
        
    }
}