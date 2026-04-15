class Solution {
    public int strStr(String haystack, String needle) {
       // return haystack.indexOf(needle);//built in_method
       int H=haystack.length();
       int N=needle.length();
       for(int i=0;i<=H-N;i++){
        if(haystack.substring(i,i+N).equals(needle)) return i;
       }
       return -1;
    } 
}