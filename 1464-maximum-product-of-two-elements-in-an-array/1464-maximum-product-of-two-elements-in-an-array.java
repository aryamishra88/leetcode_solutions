class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max1){
                idx=i;              
                max1=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max2&&i!=idx){
                max2=nums[i];
            }
        }
        return ((max1-1)*(max2-1));
        
    }
}