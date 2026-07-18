class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0;
        int n=num;
        while(num>0){
            int r=num%10;
            rev=rev*10+r;
            num/=10;
        }
        int doubleRev=0;
        while(rev>0){
            int rem=rev%10;
            doubleRev=doubleRev*10+rem;
            rev/=10;
        }
        return (n==doubleRev);
        
    }
}