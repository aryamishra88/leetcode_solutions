class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]-nums[i]==k){
                count++;
            }
        }
       }
       return count;
    }
}