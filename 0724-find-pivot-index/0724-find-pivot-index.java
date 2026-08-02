class Solution {
    public int pivotIndex(int[] nums) {
        
        int rs[]=new int[nums.length];
        int ls[]=new int[nums.length];
        int rsum=0;
        int lsum=0;
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