class Solution {
    public int reverse(int n) {
        int sign=1;
       // for negative number
        if(n<0){
            sign=-1;
            n=-n;

        }
       
        int rev=0;
        while(n>0){
            int rim=n%10;
            if(rev>Integer.MAX_VALUE/10){
                return 0;
            }
            rev =rev*10+rim;
            n=n/10;
        }
        rev=rev*sign;
        
        return rev;
    }
}