class Solution {
    public int minimumDistance(int[] nums) {
        int dis=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] &&  nums[j]==nums[k]){
                            int result=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                            dis=Math.min(dis,result);
                    }
                }
            }
        }
        if(dis!=Integer.MAX_VALUE){
            return dis;
        }
        else{
            return -1;
        }
    }
}