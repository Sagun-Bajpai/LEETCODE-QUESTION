class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
        }
        long half=sum/2;

        if(sum%2!=0) return false;
        //horizontally check
        long prefix=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                prefix+=grid[i][j];
            }
            if(prefix==half)  return true;
        }

        //vertically check
        prefix=0;
        for(int j=0;j<n-1;j++){
            for(int i=0;i<m;i++){
                prefix+=grid[i][j];
            }
            if(prefix==half)  return true;
        }
        return false;
        
    }
}