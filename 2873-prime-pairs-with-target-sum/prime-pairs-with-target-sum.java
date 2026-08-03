class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        ArrayList<Integer> prime=new ArrayList<>();

        for(int i=0;i<=n;i++)
        {
            prime.add(1);
        }

        prime.set(0,0);
        prime.set(1,0);
         
         for(int i=2;i*i<=n;i++)
         {
            if(prime.get(i)==1)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime.set(j,0);
                }
            }
         }


         List<List<Integer>> result=new ArrayList<>();
          
        for(int i=2;i<=n/2;i++)
        {
            if(prime.get(i)==1 && prime.get(n-i)==1)
            {
                result.add(Arrays.asList(i,n-i));
            }
        }
     
       return result;
    }
}