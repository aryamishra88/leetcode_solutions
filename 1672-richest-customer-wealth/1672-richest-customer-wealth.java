class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int i=0;i<accounts.length;i++){
            int amount=0;
            for(int j=0;j<accounts[0].length;j++){
                amount+=accounts[i][j];
            }
            wealth=Math.max(wealth,amount);
        }
        return wealth;
        
    }
}