//if / else if → sirf ek block chalega (jo pehle true mila, wahi chalega, baaki skip ho jayenge)

//if / if → dono blocks check honge, independently (dono chal sakte hain, agar dono conditions true hain)
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max_sum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;   
            }
        }
        return max_sum;
    }
}