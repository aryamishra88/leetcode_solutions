class Solution {
    public long countSubarrays(int[] nums, long k) {
        int i=0;
        int j=0;
        int n=nums.length;
        long sum=0;
        long score=0;
        int l=0;
        long count=0;
        while(j<n){
            sum+=nums[j];
            l=j-i+1;
            score=sum*l;
            while(score>=k&&i<=j){
                sum-=nums[i];
                i++;
                l=j-i+1;
                score=sum*l;

            }
            count+=(j-i+1);
            j++;
            

        }
        return count;
        
    }
}