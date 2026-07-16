class Solution {
    public int singleNumber(int[] nums) {
       int result=0;int i;
        if (nums.length==1)
        {
            return nums[0];
        }

        for( i=0;i<nums.length;i++)
        {
          result=result ^ nums[i];
        }
        return result;
        
    }
}
