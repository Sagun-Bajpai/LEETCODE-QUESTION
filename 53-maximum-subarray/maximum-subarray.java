//if / else if → sirf ek block chalega (jo pehle true mila, wahi chalega, baaki skip ho jayenge)

//if / if → dono blocks check honge, independently (dono chal sakte hain, agar dono conditions true hain)
class Solution {
    public int maxSubArray(int[] arr) {
      int maxsum=Integer.MIN_VALUE;
      int currsum=0;
      int n=arr.length;
      int i=0;
      while(i<n){
        currsum += arr[i];
        maxsum=Math.max(currsum,maxsum);
        if(currsum<0){
            currsum=0;
        }
        i++;
        
        
      }
       return maxsum;
    }
}