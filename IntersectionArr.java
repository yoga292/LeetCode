class IntersectionArr{
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> r=new HashSet<>();
        for(int num1:nums1)
        {
            s.add(num1);
        }
        for(int num2:nums2)
        {
            if(s.contains(num2))
            {
               r.add(num2); 
            }
        }
        int[]res=new int[r.size()];
        int i=0;
        for(int val:r)
        {
            res[i++]=val;
        }
        return res;
        /*int n1=nums1.length;
        int n2=nums2.length;
        int l=Math.max(n1,n2);
        int r[]=new int[l];
        int k=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    r[k++]=nums1[i];
                    break;
                }
            }
        }
         return r;*/
        
        
    }
}
