class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;int f=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(target==matrix[i][j])
                {
                    f=1;
                }
            }
        }
        if(f==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
