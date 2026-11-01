class Solution {
    public String removeOccurrences(String s, String part) {

        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));

            int k=stack.size()-1;
           int j=part.length()-1;

            while(j>=0 && stack.size()>=part.length())
            {
             if(stack.get(k)==part.charAt(j))
             {
                k--;
                j--;
             }
             else
             {
                break;
             }
            }
            if(j==-1)
            {
                for(int l=0;l<part.length();l++)
                {
                    stack.pop();
                }
            }



        }

        for(char ch:stack)
        {
            sb.append(ch);
        }
        String result=sb.toString();

        return result;
    }
}