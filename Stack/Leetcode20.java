import java.util.*;

class Solution
{
     public boolean isValid(String s)
     {
            Stack<Character>st = new Stack<>();
            
            for(int i=0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(ch=='(' || ch=='{' || ch=='[')
                {
                    st.push(ch);
                }
                else
                {
                    if(st.isEmpty())
                    {
                        return false;
                    }
                    st.pop();
                     if( (st.peek()=='(' && ch!= ')') || 
                              (st.peek()=='{' && ch!='}') ||
                               (st.peek()=='[' && ch !=']'))
                               {
                                  return false;
                               }
                               
                }
            }

            return true;
     }
}

public class Leetcode20 
{
    public static void main(String args[])
    {
          String str = "(";
          Solution s = new Solution();
         System.out.println( s.isValid(str));
    }
    
}
