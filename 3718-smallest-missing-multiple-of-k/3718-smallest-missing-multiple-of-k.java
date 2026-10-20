class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=1;
        int found=0;
        int multiple=k;
        while(i<=nums.length){
            multiple=k*i;
            if(!set.contains(multiple)){
                found=1;
                break;
            }
            
            i++;
        }
        if(found==0){
            return k*i;
        }
        return multiple;
    }
}