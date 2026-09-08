class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int longest=0;
        int count=0;
        int lastsmaller=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]-1== lastsmaller){
                count++;
                lastsmaller=arr[i];

            }
            else if(arr[i]!=lastsmaller){
                count=1;
                lastsmaller=arr[i];
            }
            longest=Math.max(longest,count);
            
        }
        return longest;

        
    }
}