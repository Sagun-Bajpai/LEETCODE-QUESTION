class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        //int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                // i ko left se compare karenge jisme non zero hoga usko 0 se replace krr dega;
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
               
                
            }
            
        }
    }
}