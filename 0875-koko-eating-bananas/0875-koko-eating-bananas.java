class Solution {
    private boolean isPossible(int []piles,int h,int mid){
        int hour=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]<=mid){
                hour++;
            }else if(piles[i]%mid==0){
                hour+=piles[i]/mid;


            }else if(piles[i]%mid!=0){
                hour+=piles[i]/mid+1;
            }
            if(hour>h){
                return false;
            }
        }
        return true;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        int s=1;
        int e=maxi;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(isPossible(piles,h,mid)){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;


        
    }
}