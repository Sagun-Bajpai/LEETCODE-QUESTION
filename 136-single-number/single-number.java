class Solution {
    public int singleNumber(int[] arr) {
      HashSet<Integer>set=new HashSet<>();
      for(int nums:arr){
        if(set.contains(nums)){
            set.remove(nums);
        }
        else{
            set.add(nums);
        }
        }
        return set.iterator().next();
    }
}