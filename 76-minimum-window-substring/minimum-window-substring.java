class Solution {
    public String minWindow(String s, String t) {   //Sliding window with two pointers
        
        int[] sWin=new int[256];
        int[] tWin=new int[256];

        for(char ch:t.toCharArray())
        {
            tWin[ch]++;
        }

        int low=0;
        int high=0;
        int minWin=Integer.MAX_VALUE;
        int minStart=0;

        for(;high<s.length();high++)
        {
            sWin[s.charAt(high)]++;

            while(contains(sWin,tWin))
            {
                if(high-low+1<minWin)
                {
                    minWin=high-low+1;
                    minStart=low;
                }
                sWin[s.charAt(low++)]--;
            }
        }

        return minWin==Integer.MAX_VALUE?"":s.substring(minStart,minStart+minWin);
    }

    private boolean contains(int[] sWin,int[] tWin)
    {
        for(int i=0;i<256;i++){
        if(tWin[i]>sWin[i])
        {
            return false;
        }
    }
    return true;
    }

}

/**We use two pointers, low (left) and high (right), to maintain a sliding window over the string. The high pointer expands the window by adding characters until all characters of t are included. Once the window becomes valid, the low pointer shrinks it as much as possible while maintaining validity, and we update the minimum window whenever a smaller valid substring is found.**/
