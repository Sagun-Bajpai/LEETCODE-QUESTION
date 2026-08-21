//optimal  approach
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int ans=target-arr[i];
            if(map.containsKey(ans)){
            //check key is exist or not
               return new int[]{map.get(ans),i};
            }
            else{
                  map.put(arr[i],i);

            }
           

        }
        return new int[]{};
        
    }
}