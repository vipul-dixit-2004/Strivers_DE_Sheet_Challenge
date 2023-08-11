class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int colFirst = matrix[0][0];
        // transverse the matrix and keeping the track in matrix[i][0] and matrix[0][j] and for matrix[0][0] in colFirst
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    if(j!=0)
                        matrix[0][j] = 0;
                    else
                        colFirst = 0;
                }
            }
        }
        // changing to zero for all rows except 1st row and 1st col.
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        // taking care of first col.
        if(matrix[0][0]==0){
            for(int j=0; j<matrix[0].length;j++){
                matrix[0][j] =0;  
            }
        }
        //making changes in first row.
        if(colFirst == 0){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
        //and all set.....

        }

    }
