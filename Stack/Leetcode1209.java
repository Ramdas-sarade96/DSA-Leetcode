import java.util.*;
class Solution
{
    String removeDuplicates(String s, int k)
    {
         Stack<Character>st = new Stack<>();
         Stack<Integer>count = new Stack<>();
         StringBuilder ans = new StringBuilder();
         int n = s.length();
         for(int i=0;i<n;i++)
         {
              char ch = s.charAt(i);
               
                 if(!st.isEmpty() && st.peek()==ch )
                {
                    int c =count.pop();   
                    c++;
                    if(c==k)
                    {
                        st.pop();
                    }
                    else
                    {
                        count.push(c);
                    }

                }
                else 
                {
                    st.push(ch);
                    count.push(1);
                    
                }
         }

       for(int i=0;i<st.size();i++)
       {
          for(int j=0;j<count.get(i);j++)
          {
             ans.append(st.get(i));
          }
       }

         return ans.toString();
    }
}

public class Leetcode1209 
{
    public static void main(String args[])
    {
        String str = "deeedbbcccbdaa";
        int k=3;
        Solution s = new Solution();
       System.out.println( s.removeDuplicates(str,k));
    }    
}
