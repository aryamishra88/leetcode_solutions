class Solution {
    public int dominantIndex(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int idx1=0;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max1=nums[i];
                idx1=i;
            }
            
            
        }
        for(int i=0;i<nums.length;i++){
            if(max2<nums[i]&&idx1!=i){
                max2=nums[i];
            }
        }
        if(max1>=max2*2){
            return idx1;
        }
        return -1;
    }
}