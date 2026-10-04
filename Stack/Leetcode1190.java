import java.util.*;

class Solution
{
    public String reverseParentheses(String s)
    {
           int n = s.length();
           Stack<Character>strStack = new Stack<>();
           StringBuilder result = new StringBuilder(); 
          
           for(int i=0;i<n;i++)
           {
               Stack<Character>ans = new Stack<>();
               char ch = s.charAt(i);
               if(ch==')')
               {
                   while(strStack.peek()!='(')
                   {
                        ans.push(strStack.pop());
                   }
                   strStack.pop();
                  for(Character c:ans)
                    {
                        strStack.push(c);
                    } 
               }
               else
                {
                       strStack.push(ch);
                }
           }

           for(Character ch:strStack)
           {
               result.append(ch);
           }

           return result.toString();
    }
}

public class Leetcode1190 
{
    public static void main(String args[] )
    {
        String str = "(ed(et(oc))el)";
        Solution s = new Solution();
        System.out.println(s.reverseParentheses(str));
    }
    
}
