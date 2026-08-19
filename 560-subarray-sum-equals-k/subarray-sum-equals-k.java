class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count=0;
        int previousSum=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        int currentSum=0;
        map.put(0,1);

        for( int i=0;i<nums.length;i++)
        {
            currentSum=currentSum+nums[i];
            previousSum=currentSum-k;

            if(map.containsKey(previousSum))
            {
                  count+=map.get(previousSum);
            }

            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
       return count;
    }
}