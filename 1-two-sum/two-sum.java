//brute force approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int required=target-current;
            if(map.containsKey(required)){
                return new int[]{map.get(required),i};
            }
            map.put(current,i);
        }
        // if no find a valid pair then return a empty array
        return new int[]{};
    }
}