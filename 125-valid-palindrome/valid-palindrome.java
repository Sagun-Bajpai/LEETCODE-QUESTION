class Solution {
    public boolean isPalindrome(String s) {
        int st=0;
        int end=s.length()-1;
        while(st<end){
            while(st<end && !Character.isLetterOrDigit(s.charAt(st))){//Character.isLetterOrDigit(c)   built in method jo check krta hai letter ya digit hai ki nhi
                st++;
            }
            while(st<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(end))){//small letter(start) !=small letter(end) 
              return false; 
            }
            st++;
            end--;
        }
        return true;
    }
}