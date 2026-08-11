class Solution {
    public boolean isPalindrome(String s) {
        
        String r=s.replaceAll("[^a-zA-Z0-9]",""); //This line used to ignore all special characters from String (:,; etc) becuse its helps to compare each character with another 

        int low=0;
        int high=r.length()-1;
        r=r.toLowerCase();

        while(low<high)
        {
            if(r.charAt(low)==r.charAt(high))
            {
                low++;
                high--;
            }
            else
            {
            return false;
            }
        }
        return true;
    }
}
