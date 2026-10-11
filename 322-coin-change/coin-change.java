class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dpcoins=new int[amount+1];
        dpcoins[0]=0;

        if(amount==0)
        {
            return 0;
        }

        for(int i=1;i<=amount;i++)
        {
            dpcoins[i]=Integer.MAX_VALUE;

            for(int coin:coins)
            {
                if(coin<=i&&dpcoins[i-coin]!=Integer.MAX_VALUE)
                {
                    dpcoins[i]=Math.min(dpcoins[i],dpcoins[i-coin]+1);
                }
            }
        }

        if(dpcoins[amount]==Integer.MAX_VALUE)
        {
            return -1;
        }
        
        return dpcoins[amount];
    }
}