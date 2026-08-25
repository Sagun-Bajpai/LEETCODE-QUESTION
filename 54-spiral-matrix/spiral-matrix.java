class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        ArrayList<Integer>result= new ArrayList<>();

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                //System.out.print(matrix[startRow][j]+" ");
                result.add(matrix[startRow][j]);
            }

            //right column
            for(int i=startRow+1; i<=endRow;i++){
                /// System.out.print(matrix[i][endCol]+" ");
                result.add(matrix[i][endCol]);

            }

            //bottom row

            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                // System.out.print(matrix[endRow][j]+" ");
                result.add(matrix[endRow][j]);
            }

            //lest Column

            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                // System.out.print(matrix[i][startCol]+" ");
                result.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
        
    }
}