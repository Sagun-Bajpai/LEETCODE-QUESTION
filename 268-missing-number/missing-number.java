//using method for sumformula
class Solution {
    public int missingNumber(int[] nums) {
       int n= nums.length;
       int totalRangeSum=(n*(n+1))/2;
       int expectedSum=0;
       for(int i=0;i<n;i++){
        expectedSum += nums[i];
       }

       int missingNo=totalRangeSum-expectedSum;
       return missingNo;
    }
}