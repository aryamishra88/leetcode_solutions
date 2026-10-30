class Solution {
    public int countEven(int num) {
        int ans=0;
        for(int i=2;i<=num;i++){
            int n=i;
            int sum=0;
            while(n>0){
                int r=n%10;
                sum+=r;
                n/=10;
            }
            if(sum%2==0){
                ans++;
            }

        }
        return ans;
    }
}