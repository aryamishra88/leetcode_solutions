class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
                if(ch=='i'||ch=='o'||ch=='a'||ch=='e'||ch=='u'){
                    count++;
                }
            if(j-i+1==k){
                max=Math.max(max,count);
                char c=s.charAt(i);
                if(c=='i'||c=='o'||c=='a'||c=='e'||c=='u'){
                    count--;
                    
                }
                i++;
            }
            


            

        }
        return max;
        
    }
}