class Solution {
    public int arraySign(int[] nums) {
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                product=0;
                break;
            }else if(nums[i]<0){
                product*=-1;
            }else product*=1;
        }
        return signFunc(product);
        
    }
    private static int signFunc(int p){
        if(p==0){
            return 0;
        }else if(p==-1){
            return -1;
        }else return 1;
    }
}