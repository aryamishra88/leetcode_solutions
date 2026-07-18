class Solution {
    public int smallestEvenMultiple(int n) {
        int smallestans=Integer.MAX_VALUE;
        for(int i=1;i<=n*2;i++){
            if((i%n==0)&&(i%2==0)){
                int ans=i;
                smallestans=Math.min(ans,smallestans);
            }
        }
        return smallestans;
        
    }
}