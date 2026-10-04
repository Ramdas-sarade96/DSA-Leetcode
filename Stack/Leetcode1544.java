import java.util.*;

class Solution
{
      public String makeGood(String s)
      {
         StringBuilder stBuilder = new StringBuilder();
         Stack<Character>st  = new Stack<>();
         for(int i=0;i<s.length();i++)
         {
             Character ch  = s.charAt(i);
             if(!st.isEmpty() && Character.toLowerCase(st.peek()) == Character.toLowerCase(ch) &&
             Character.isUpperCase(st.peek()) != Character.isUpperCase(ch))
               {
                    st.pop();
                }

                    else 
                    {
                      st.push(ch);
                    }
                
         }

         for(Character i:st)
         {
            stBuilder.append(i);
         }
         return stBuilder.toString();
         

      }
      

}

public class Leetcode1544 
{
  public static void main(String args[])
  {
    String str = "kkdsFuqUfSDKK";
    Solution s = new Solution();
    System.out.println(s.makeGood(str));
  }
    
}
