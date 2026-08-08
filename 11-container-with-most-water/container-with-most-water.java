class Solution {
    public int maxArea(int[] height) {

        int low=0;
        int high=height.length-1;
        int maxAr=Integer.MIN_VALUE;

        while(low<high)
        {
            int width=high-low;
            int currentHeight=Math.min(height[low],height[high]);
            int mostWater=width*currentHeight;
            maxAr=Math.max(maxAr,mostWater);
        
        if(height[low]<height[high])
        {
            low++;
        }
        else
        {
            high--;
        }
        }
        return maxAr;
    }
}