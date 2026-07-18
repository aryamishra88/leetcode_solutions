class Solution {
    public int[] shuffle(int[] nums, int n) {
       int []arr=new int[2*n];
       int start=0;
       int mid=n;
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            arr[i]=nums[start];
            start++;

        }else{
            arr[i]=nums[mid];
            mid++;
        }
       }
        
       return arr;
        
    }
}