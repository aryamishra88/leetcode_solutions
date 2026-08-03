class Solution {
    public int findMiddleIndex(int[] nums) {
        int rsum=0;
        int[]rs=new int[nums.length];
        int lsum=0;
        int []ls=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ls[i]=lsum;
            lsum+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            rs[i]=rsum;
            rsum+=nums[i];

        }
        for(int i=0;i<nums.length;i++){
            if(rs[i]==ls[i]){
                return i;
            }
        }
        return -1;
        
    }
}