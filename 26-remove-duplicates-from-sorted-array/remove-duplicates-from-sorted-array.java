class Solution {
    public int removeDuplicates(int[] nums) {
   
        int j=0;
        int count=1;
        while(j<nums.length-1){
            if(nums[j]==nums[j+1]){
                j++;
                continue;
            }
            else{
                
                nums[count]=nums[j+1];
                count++;
               j++;
            }
            
        }
        return count;
        
    }
}