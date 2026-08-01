class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            ls[i]=sum;
            sum+=nums[i];
        }
        int rsum=0;
        for(int i=nums.length-1;i>=0;i--){
            rs[i]=rsum;
            rsum+=nums[i];
        }
        int ans[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=ls[i]-rs[i];
            if(ans[i]<0){
                ans[i]=-1*ans[i];
            }

        }
        return ans;
        

        
    }
}