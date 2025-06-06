class PascalTriangle{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList();
        int i,j;
        for(i=0;i<numRows;i++)
        {
            List<Integer>row=new ArrayList();
            for(j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    row.add(1);
                }
                else
                {
                    List<Integer>prev=result.get(i-1);
                    row.add(prev.get(j)+prev.get(j-1));
                }
            }
            result.add(row);
        }
    return result;
        
    }
}
