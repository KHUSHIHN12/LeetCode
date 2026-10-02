class Solution {
    public String reverseWords(String s) {

    
    String result="";
    String[] words=s.split(" ");

    for(int i=0;i<words.length;i++)
    {
        String word=words[i];

            for(int j=word.length()-1;j>=0;j--)
            {
                 result=result+word.charAt(j);  
            }

            if(i<words.length-1)
            {
                result=result+" ";
            }
        }
        return result;
    }
   
        
    }
