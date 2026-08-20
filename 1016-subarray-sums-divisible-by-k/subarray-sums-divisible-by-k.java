class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0;
        int Reminder=0;
        int count=0;
        map.put(0,1);

       //if(nums.length==1)
      // {
       // if(Math.abs(nums[0])%k==0)
        //{
        //    return 1;
       // }
      // }

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            Reminder=Math.floorMod(sum,k);

            if(map.containsKey(Reminder))
            {
             int previousIndex=map.getOrDefault(Reminder,0);
               // int laength=i-previousIndex;
                count+=previousIndex;
               // Reminder=previousIndex+1;
            }
            map.put(Reminder,map.getOrDefault(Reminder,0)+1);
        }

    return count;
    }
}