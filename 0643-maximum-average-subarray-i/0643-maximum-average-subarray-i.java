class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double maxAvg=Integer.MIN_VALUE;
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i+1==k){
                double avg=(double)sum/k;
                maxAvg=Math.max(avg,maxAvg);
                sum-=nums[i];
                i++;
            }
        }
        return maxAvg;


        
    }
}