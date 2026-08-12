class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j=(int)Math.sqrt(c);
        while(i<=j){
            if((long)i*i+(long)j*j==c){
                return true;
            }else if((long)i*i+(long)j*j<c){
                i++;
            }else{
                j--;
            }

        }
        return false;
        
    }
}