class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(c[i][j]==0)
                {
                    for(int k=0;k<n;k++)
                    {
                        matrix[i][k]=0;
                    }
                    for(int l=0;l<m;l++)
                    {
                        matrix[l][j]=0;
                    }
                }
            }
        }
    }
}
