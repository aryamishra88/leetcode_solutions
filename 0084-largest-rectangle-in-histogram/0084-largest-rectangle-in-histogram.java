class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;

        // pse 
        int[] pse=new int[n];
        Deque<Integer> pt=new ArrayDeque<>();  // stack
        for(int i=0;i<n;i++){
            while(!pt.isEmpty() && heights[pt.peek()]>heights[i]) pt.pop();
            if(pt.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=pt.peek();
            }
            pt.push(i);
        }
        // nse 
        int[] nse=new int[n];
        Deque<Integer> nt=new ArrayDeque<>();  // stack
        for(int i=n-1;i>=0;i--){
            while(!nt.isEmpty() && heights[nt.peek()]>=heights[i]) nt.pop();
            if(nt.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=nt.peek();
            }
            nt.push(i);
        }

        int ans=0;
        for(int i=0;i<n;i++){
            int width=nse[i]-pse[i]-1;
            ans=Math.max(ans, width*heights[i]);
        }
        return ans;
    }
}