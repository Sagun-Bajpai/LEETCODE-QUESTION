class Solution {
    public boolean check(int[] arr) {
        int n=arr.length;
        int breaks=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                breaks++;
            }
        }
        if(breaks<=1){
            return true;
        }
        return false;
        
    }
}