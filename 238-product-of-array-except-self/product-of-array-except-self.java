class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer=new int[nums.length];
        int prefixSum=1;
        int suffixSum=1;
        answer[0]=1;

        for(int i=1;i<nums.length;i++)
        {
            prefixSum=nums[i-1]*prefixSum;
            answer[i]=prefixSum;
        }

        for(int i=nums.length-2;i>=0;i--)
        {
            suffixSum=nums[i+1]*suffixSum;
            answer[i]=answer[i]*suffixSum;
        }

        return answer;
    }
}