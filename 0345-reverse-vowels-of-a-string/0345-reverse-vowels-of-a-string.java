class Solution {
    private boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
}
    public String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        
        char arr[]=new char[s.length()];
        for(int k=0;k<s.length();k++){
            arr[k]=s.charAt(k);
        }
        while(start<=end){
            if((isVowel(arr[start]))&&(isVowel(arr[end]))){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(!isVowel(arr[start])){
                start++;
            }else if(!isVowel(arr[end])){
                end--;
            }
            
        }
        return new String(arr);
        
    }
}