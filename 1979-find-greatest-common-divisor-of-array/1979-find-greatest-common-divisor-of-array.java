class Solution {
    public int findGCD(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        int gcd=0;
        for(int i=1;i<=smallest;i++){
            if((largest%i==0)&&(smallest%i==0)){
                gcd=i;
            }
        }
        return gcd;
        
    }
}