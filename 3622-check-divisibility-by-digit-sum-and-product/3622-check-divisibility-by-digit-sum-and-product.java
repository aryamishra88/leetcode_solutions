class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int num=n;
        while(num>0){
            int r=num%10;
            sum+=r;
            p*=r;
            num/=10;
        }
        if(n%(sum+p)==0){
            return true;
        }
        return false;
    }
}