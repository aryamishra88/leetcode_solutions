class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean freq[]=new boolean[256];
        int i=0;
        int j=0;
        int max=0;
        int n=s.length();
        
        while(j<n){
            char ch=s.charAt(j);
            
            while(freq[ch]){
                freq[s.charAt(i)]=false;
                i++;
            }
            freq[ch]=true;

            int currmax=j-i+1;
            max=Math.max(max,currmax);
            j++;


        }
        return max;
        
        
    }
}