class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int reminder=0;
        map.put(0,-1);  /*map.put(0, -1)` means that a prefix sum of `0` exists before the array starts, and it helps calculate 
                          the exact number of elements in a subarray that starts from index `0`*/


        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            reminder=sum%k;

            if(map.containsKey(reminder)){
            if(i-map.get(reminder)>=2)
            {
                return true;
            }
            }
            else{
            
            map.put(reminder,i);
            }
            
        }
        return false;
    }
}
