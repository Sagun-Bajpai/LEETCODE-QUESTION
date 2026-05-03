class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length()!= goal.length())  return false;
         //add string 
        String doubled= s+s;
        // if s.length== goal.length thrn return true
        return doubled.contains(goal);
        
        
    }
}