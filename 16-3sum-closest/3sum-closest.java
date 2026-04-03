class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
          
            while(left<right){
                int currsum=nums[i]+nums[left]+nums[right];
                if(currsum==target){
                    return currsum;
                }
                else if(currsum<target){
                    left++;
                }
                else{
                    right--;
                }
                if(Math.abs(closestSum-target)>Math.abs(currsum-target)){
               closestSum=currsum;
            }

            }
            
        }
        return closestSum;
        
    } 
    
}