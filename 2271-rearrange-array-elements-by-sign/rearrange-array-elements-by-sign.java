class Solution {
    public int[] rearrangeArray(int[] arr) {
        //brute force approach
        int n= arr.length;
        int posindex=0;
        int negindex=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[negindex]=arr[i];
                negindex += 2;

            }
            else{
                ans[posindex]=arr[i];
                posindex +=2;
            }
        }
        return ans;
        
    }
}