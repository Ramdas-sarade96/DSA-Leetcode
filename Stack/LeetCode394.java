/*  Medium 
 Topics: Stack
  Time Comp : O(n)
  Space Comp : O(n)

 */

import java.util.*;
class Solution
{
    public String decodeString(String s)
    {
          String current = "";
          int num = 0;
          Stack<Integer>numStack = new Stack<>();
          Stack<String>strStack = new Stack<>();

          for(int i=0;i<s.length();i++)
          {
              char ch = s.charAt(i);
              //if character is digit

              if(Character.isDigit(ch))
              {
                num = (num*10) +(ch-'0');
              }

              //If [ comes

              else if(ch=='[')
              {
                   numStack.push(num);
                   strStack.push(current);
                   num =0;
                   current ="";
              }

              // If ] comes
              else if(ch==']')
              {
                 int repeat = numStack.pop();
                 String previous = strStack.pop();
                 String temp ="";
                 for(int j=0;j<repeat;j++)
                 {
                       temp = temp+current;
                 }
                 current = previous+temp;
              }
              else
              {
                  current = current+ch;
              }
          }
          return current;
    }
}
public class Leetcode394
{
     static void main(String args[])
    {
       Solution s = new Solution();
       String str = "2[abc]3[cd]ef";
       System.out.println(s.decodeString(str));
    }
}