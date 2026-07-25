class Solution {
    public char findTheDifference(String s, String t) {
        int sSum=0;
        for(int i=0;i<s.length();i++){
            sSum+=(int)s.charAt(i);
        }
        int tSum=0;
        for(int j=0;j<t.length();j++){
            tSum+=(int)t.charAt(j);

        }
        char c=(char)(tSum-sSum);
        return c;

        
    }
}