//Brute force Approch
import java.util.*;
public class Leetcode3090 
{
    public static void main(String args[] )
    {
        String str ="bcbbbcba";
        int n=str.length();
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            int freq[] = new int[26];
            for(int j=i;j<n;j++)
            {
                  freq[str.charAt(j)-'a']++;
                  if(freq[str.charAt(j)-'a']>2)
                  {
                    break;
                  }
                  max=Math.max(max,j-i+1);
            }
        }

        System.out.println(max);

    }  
    
}
