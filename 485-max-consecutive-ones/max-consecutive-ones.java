class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int count=0;
        int i=0;
        int max=0;
        while(i<n){
            if(arr[i]==1){
                i++;
                count++;
                if(max<count){
                    max=count;
                }
               
            }
            else{
                i++;
                count=0;
            }
        }
        return max;
       
        
    }
}