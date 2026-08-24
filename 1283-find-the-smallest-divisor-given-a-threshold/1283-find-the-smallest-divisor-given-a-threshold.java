class Solution {
    private static boolean isPossible(int []nums,int threshold,long mid){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid==0){
                sum+=nums[i]/mid;
            }else{
                sum+=(nums[i]/mid)+1;    
            }
            if(sum>threshold){
                return false;
            }
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        long  start=1;
        long end=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

        }
        end=sum;
        long ans=-1;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(isPossible(nums,threshold,mid)){
                ans=mid;
                end=mid-1;

            }else{
                start=mid+1;
            }
       


        }
        return (int)ans;

        
    }
}