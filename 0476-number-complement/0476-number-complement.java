class Solution {
    public int findComplement(int num) {
        long mask = 1;

        while (mask <= num) {
            mask <<= 1;
        }

        return (int)((mask - 1) ^ num);
    }
}