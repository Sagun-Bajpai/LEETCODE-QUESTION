class Solution {
    public String largestOddNumber(String s) {
        int right=s.length()-1;
        while(right>=0){
            if(s.charAt(right)%2!=0){
                 return s.substring(0,right+1);
                
            }
            else if(s.charAt(right)%2==0){
                right--;
                
            }
        }
        return "";
       

        
    }
}