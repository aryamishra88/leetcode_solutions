class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sec=0;
        // Queue<Integer> q=new ArrayDeque<>();
        int n = tickets.length;

        
        int i=0;
        while(tickets[k]!=0){
            if(tickets[i]==0){
                i=(i+1)%n;
                continue;
            }
            tickets[i]-=1;
            
            
            i=(i+1)%n;
            sec++;




        }
        return sec;
        
            
        
        
    }
}