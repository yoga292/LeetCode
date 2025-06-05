class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int cur=nums[0];
        int sofar=nums[0];
        int i;
        for(i=1;i<nums.length;i++)
        {
            cur=Math.max(nums[i],nums[i]+cur);
            sofar=Math.max(sofar,cur);
        } 
        return sofar;   
    }
    
}
