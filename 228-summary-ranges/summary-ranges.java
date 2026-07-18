class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> result=new ArrayList<>();
         int n=nums.length;

            int i=0;
            if(n==1)
            {
                 result.add(String.valueOf(nums[0]));
                 return result;
            }
            while(i<n){
            int start=i,end=i;

            while(end+1<n && nums[end+1]==nums[end]+1)end++;
                if(end>start)
                result.add(nums[start]+"->"+nums[end]);
                else 
                result.add(String.valueOf(nums[start]));   
                i=end+1;
    }
        
        return result;

    }
}