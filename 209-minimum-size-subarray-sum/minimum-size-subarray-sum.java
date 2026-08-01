class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int currentSum=0;
        int windowSize=Integer.MAX_VALUE;

        int high=0;
        int low=0;

        while(high<nums.length)
        {
            currentSum +=nums[high];
            high++;

            while(currentSum>=target)
            {
                int currentWindowSize=high-low;

                windowSize=Math.min(windowSize,currentWindowSize);
                currentSum-=nums[low];
                low++;

            }
        }
        return windowSize==Integer.MAX_VALUE?0:windowSize;
    }
}