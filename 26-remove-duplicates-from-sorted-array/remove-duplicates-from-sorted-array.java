class Solution {
    public int removeDuplicates(int[] arr) {
        int j=0;
        int n=arr.length;
        int count=1;
        while(j<n-1){
            if(arr[j]==arr[j+1]){
                j++;
                continue;
            }
            else{
               
                arr[count]=arr[j+1];
                 count++;
                j++;
            }
        }
        return count;
    }
}