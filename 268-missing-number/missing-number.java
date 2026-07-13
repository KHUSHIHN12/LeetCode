class Solution {
    public int missingNumber(int[] nums) {
         
         Set<Integer> set =new  HashSet<>();

         for(int j:nums){
            set.add(j);
         }

         int n=nums.length;
        int i=0;
         while(i<=n)
         {
            if(!set.contains(i)) 
             return i;
             i=i+1;
         }
         
        return i;
    } 
}
    