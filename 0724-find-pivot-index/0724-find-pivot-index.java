class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int ls=0;
            int rs=0;
            for(int j=0;j<i;j++){
                ls+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                rs+=nums[k];
            }
            if(ls==rs){
                return i;

            }
        }
        return -1;
    }
}