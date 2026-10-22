class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(!s.isEmpty()){
                    st.pop();

                }
                
            }else{
                st.push(s.charAt(i));
            }
        }
        String ans="";
        while(!st.isEmpty()){
            char ch=st.pop();
            ans+=ch;

        }
        for(int i=0;i<ans.length();i++){
            st.push(ans.charAt(i));

        }
        String fans="";
        while(!st.isEmpty()){
            char ch=st.pop();
            fans+=ch;

        }
        return fans;
        
    }
}