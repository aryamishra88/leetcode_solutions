class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder  ans= new StringBuilder("");
     
            long n=Math.abs((long)num);
            boolean negative =num<0;
        
        while(n>0){
            
            ans.append(n%7);
            n/=7;
        }
        if(negative){
            ans.append("-");
        }
        return ans.reverse().toString();
        
        
    }
}