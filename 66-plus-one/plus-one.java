class Solution {
    public int[] plusOne(int[] digits) {

       int carry = 1;
       int[] newArr = new int[digits.length + 1];

       for(int i=digits.length-1;i>=0;i--)
       {
        int sum=digits[i]+carry;
        newArr[i+1]=sum%10;
        carry=sum/10;
       }
       if (carry == 1) 
       {
    newArr[0] = 1; 
    return newArr;
       }
       else
       {
        return Arrays.copyOfRange(newArr,1,newArr.length);
       }
 
    }
}

