class Solution {
    public int mirrorDistance(int n) {
        int original = n;
        int rev=0;
        while(n>0){
            int rim=n%10;
            rev=rev*10+rim;
            n/=10;
        }
        int dis=Math.abs(original-rev);
        return dis;
        
    }
}