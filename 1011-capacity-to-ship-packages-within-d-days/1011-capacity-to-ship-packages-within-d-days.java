class Solution {
    private boolean isPossible(int weights[],int mid,int days){
        int day=1;
        int ship_load=0;
        for(int i=0;i<weights.length;){
            if(ship_load+weights[i]<=mid){
                ship_load+=weights[i];
                i++;
            }else{
                day++;
                ship_load=0;
            }
            if(day>days){
                return false;
            }

        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        int e=sum;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2 ;
            if(isPossible(weights,mid,days)){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}