class Solution {
    private boolean isPossible(int position[],int mid,int m){
        int balls=1;
        int pos=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-pos>=mid){
                balls++;
                pos=position[i];
            }
            if(balls==m){
                return true;
            }
        }
        return false;

    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int s=1;
        int n=position.length;
        int e=position[n-1]-position[0];
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(position,mid,m)){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }

        return ans;
        
    }
}