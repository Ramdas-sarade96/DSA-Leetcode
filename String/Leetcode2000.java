class Solution
{
     String reversePrefix(String word, char ch)
     {
            int n = word.length();
            int index =-1;
            String ans = "";
            for(int i=0;i<n;i++)
            {
                 char c = word.charAt(i);
                 if(c==ch)
                 {
                    index = i;
                    break;
                 }
            }
            
            if(index==-1)
            {
                return word;
            }
             for(int i=index;i>=0;i--)
             {
                char c = word.charAt(i);
                 ans = ans+c;
             }

             ans = ans+word.substring(index+1,word.length());

            
             return ans;


     }
}

public class Leetcode2000
{
    public static void main(String args[])
    {
          String str = "xyxzxe";
          char ch = 'z';
          Solution s = new Solution();
         System.out.println( s.reversePrefix(str,ch));

    }
}