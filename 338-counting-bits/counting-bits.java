class Solution {
    public int[] countBits(int n) {
        
        int[] result=new int[n+1];
        

        for(int i=0;i<=n;i++)
        {
            int counter=0;
            int temp=i;

            while(temp!=0)
            {
            temp=temp&(temp-1);
            counter++;
              //result[i]=counter;
            }
           result[i]=counter;
            
            }
           return result;
        }

    }
