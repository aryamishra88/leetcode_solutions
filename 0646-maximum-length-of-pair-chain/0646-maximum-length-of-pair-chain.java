class Solution {
    public int findLongestChain(int[][] pairs) {
        int [][] nums=new int[pairs.length][3];
        for(int i=0;i<pairs.length;i++){
            nums[i][0]=i;
            nums[i][1]=pairs[i][0];
            nums[i][2]=pairs[i][1];
        }
        Arrays.sort(nums,Comparator.comparingInt(o->o[2]));
        int maxPairs=1;
        int lastEnd=nums[0][2];
        for(int i=1;i<nums.length;i++){
            if(nums[i][1]>lastEnd){
                maxPairs++;
                lastEnd=nums[i][2];
            }
        }
        return maxPairs;
        
    }
}