class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int i=0;
        // int j=0;
        // while(i>nums.length)
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   
                        set.add(nums1[i]);
                    

                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
        
    }
}