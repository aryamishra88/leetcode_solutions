class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> s=new Stack<>();
        int ans[]=new  int [nums.length];
        int n=nums.length;
        for(int i=n*2-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=nums[i%n]){
                s.pop();
            }
            if(i<n){
                if(s.isEmpty()){
                    ans[i%n]=-1;
                }else{
                    ans[i%n]=s.peek();
                }
            }
            s.push(nums[i%n]);
        }
        return ans;

    }
}