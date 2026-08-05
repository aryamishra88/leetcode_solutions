class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int max=-1;
        while(j<n){
            if(nums[j]==0){
                k--;
            }
            while(k==-1){
                if(nums[i]==0){
                    k++;
                }
                i++;
            }
            int currmax=j-i+1;
            max=Math.max(currmax,max);
            j++;

        }
        return max;
        

    }
}