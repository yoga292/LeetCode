class MissingNumber{
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            sum1+=i;
        }
        for(int i=0;i<n;i++)
        {
            sum2+=a[i];
        }
        int diff=sum1-sum2;
        return diff;
    }
}
