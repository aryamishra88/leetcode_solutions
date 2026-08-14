class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0;
        int sum=0;
        int count=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(j-i+1==k){
                int avg=sum/k;
                if(avg>=threshold){
                    count++;
                }
                sum-=arr[i];
                i++;
            }

        }
        return count;
    }
}