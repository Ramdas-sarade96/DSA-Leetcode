import java.util.*;
class Solution
{
    String removeOccurrences(String s, String part)
    {
          while(s.contains(part))
          {
            int index = s.indexOf(part);
            System.out.println(index);
            s= s.substring(0,index) + s.substring(index + part.length());
          }
          return s;
       
    }
}

public class Leetcode1910 
{
    public static void main(String args[])
    {
          Solution s = new Solution();
          String str = "daabcbaabcbc";
          String part ="abc";
          System.out.println(s.removeOccurrences(str,part));
          System.out.println("s.reverse");
          System.out.println("Enter the ");
          Solution s = new Solution();
    }
    
}
