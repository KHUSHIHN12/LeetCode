class Solution {
    public String reverseWords(String s) {

    
    StringBuilder result=new StringBuilder();
    String[] words=s.split(" ");

    for(int i=0;i<words.length;i++)
    {
        String word=words[i];

            for(int j=word.length()-1;j>=0;j--)
            {
                 result.append(word.charAt(j));  
            }

            if(i<words.length-1)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }
   
        
    }
