class Solution {
    public List<Integer> findMissingElements(int[] nums) {
     ArrayList<Integer>list=new ArrayList<>();
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
 
     for(int i=0;i<nums.length;i++){
        if(max<nums[i]){
            max=nums[i];
        
        }

     }  
     for(int i=0;i<nums.length;i++){
        if(min>nums[i]){
            min=nums[i];
            
        }

     }  
     for(int i=min;i<=max;i++){
       
        int f=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==i){
                f=1;
            }

        }
        if(f==0){
            list.add(i);
        }

     } 
     return list;
    }
}