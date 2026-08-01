class Solution {
    public int maxSubArray(int[] nums) {
        
        int csum=nums[0];
        int msum=nums[0];


        if(nums.length==1)
        {
            return nums[0];
        }

        for(int i=1;i<=nums.length-1;i++)
        {
            csum=Math.max(nums[i],csum+nums[i]);
            msum=Math.max(msum,csum);
        }
        return msum;
    }
}