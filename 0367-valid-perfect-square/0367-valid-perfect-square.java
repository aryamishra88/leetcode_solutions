class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
            
        }
        int i=0;
        int j=num/2;
        
        while(i<=j){
            int mid=(i+j)/2;
            if((long)mid*mid==num){
                return true;
            }else if((long)mid*mid<num){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return false;
        
    }
}