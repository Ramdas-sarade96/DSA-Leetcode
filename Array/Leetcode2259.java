
import java.util.*;
public class Leetcode2259 
{
    public static void main(String args[])
    {
        //String number = " 1231";
        String number="1231";
        char digit = '1';
        int result=Integer.MIN_VALUE;
        int n = number.length();
        for(int i=0;i<n;i++)
        {
            char ch=number.charAt(i);
            String temp="";
            if(ch==digit)
            {
                for(int j=0;j<n;j++)
                {
                         if(j!=i)
                         {
                            temp=temp+number.charAt(j);
                         }
                }
                int temp2=Integer.parseInt(temp);
                result=Math.max(result,temp2);

            }
        }

        System.out.println(result);
    }
     
    
}






















import java.math.BigInteger;

class Solution {

    public String removeDigit(String number, char digit) {

        BigInteger result = BigInteger.ZERO;

        int n = number.length();

        for (int i = 0; i < n; i++) {

            char ch = number.charAt(i);

            if (ch == digit) {

                String temp = "";

                for (int j = 0; j < n; j++) {

                    if (j != i) {
                        temp = temp + number.charAt(j);
                    }
                }

                BigInteger temp2 = new BigInteger(temp);

                if (temp2.compareTo(result) > 0) {
                    result = temp2;
                }
            }
        }

        return result.toString();
    }
}
