class Solution {
    public List<List<Integer>> generate(int numRow) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numRow;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                row.add(nCr(i,j));

            }
            result.add(row);
        }
        return result;
        
    }
    public static int nCr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res *(n-i);
            res=res/(i+1);
        }
        return res;
        
    }
}