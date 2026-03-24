class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int size=n*m;
        int mod=12345;
        //step1: Flatten matrix
        int[]arr=new int[size];
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[index++]=grid[i][j]%mod;
            }
        }

        //step2:prefix
        int[]prefix=new int[size];
        prefix[0]=1;
        for(int i=1;i<size;i++){
            prefix[i]=(prefix[i-1]*arr[i-1])%mod;
        }

        //step3:suffix
        int[]suffix=new int[size];
        suffix[size-1]=1;
        for(int i=size-2;i>=0;i--){
            suffix[i]=(suffix[i+1]*arr[i+1])%mod;
        }

        //step4:resulr 1D
        int []result1D=new int[size];
        for(int i=0;i<size;i++){
            result1D[i]=(prefix[i]*suffix[i])%mod;
        }

        //step5:convert back to 2D
        int[][]result=new int[n][m];
        index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=result1D[index++];
            }
        }
        return result;


        
    }
}