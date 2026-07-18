class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int pos=0;
        int neg=0;
        for(int i=0;i<operations.length;i++){
            if((operations[i].equals("X++"))||(operations[i].equals("++X"))){
                pos++;
            }else if((operations[i].equals("--X"))||(operations[i].equals("X--"))) {
                neg--;
            }
        }
        return pos+neg;
        
    }
}