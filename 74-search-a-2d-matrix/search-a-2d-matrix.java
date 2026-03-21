class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //let n is row , m is coloumn
        int n=matrix.length, m=matrix[0].length;
        int st=0,end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midEle=matrix[mid/m][mid%m];
            if(midEle==target){
                return true;
            }
            else if(midEle<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return false;
        
    }
}