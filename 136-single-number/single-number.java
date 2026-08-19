class Solution {
    public int singleNumber(int[] arr) {
      HashSet<Integer>set=new HashSet<>();
      for(int nums:arr){
        if(set.contains(nums)){
            set.remove(nums);
        }else{
             set.add(nums);
            
        } 
      }
      
      int singleNo=0;
      for(int x:set){
        singleNo=x;
        
      }
      return singleNo; 
    }
}