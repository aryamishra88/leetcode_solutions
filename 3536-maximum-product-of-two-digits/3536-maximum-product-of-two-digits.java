class Solution {
    public int maxProduct(int n) {
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;
        int num=n;
        int count=0;
        
        while(num>0){
            int r=num%10;
            count++;
            num/=10;
        }
        int arr[]=new int[count];
        
        while(n>0){
            int r=n%10;
            arr[count-1]=r;
            n/=10;
            count--;

        }
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
                idx=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(secLargest<arr[i]&&i!=idx){
                secLargest=arr[i];
            }
        }
        return largest*secLargest;
    }
}