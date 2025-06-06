class MajorityElement{
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int sofar=0;
        int max=0;
        if(n==1)
        {
            return nums[0];
        }
        for(int i=0;i<n;i++)
        {
            cnt=0;
            for(int j=i+1;j<n;j++)
            {
               if(nums[i]==nums[j])
               {
                cnt++;
               }
               
            }
            if(cnt>sofar)
            {
                sofar=cnt;
                max=nums[i];
            }
        }
        return max;      
    }
}
