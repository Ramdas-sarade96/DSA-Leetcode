import java.util.*;
public class Leetcode459 
{
    public static void main(String args[])
    {
        String s = "abab";
        int n = s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        String temp="";
        for(int i=0;i<n;i++)
        {
              if(!map.containsKey(s.charAt(i)))
              {
                map.put(s.charAt(i),1);
                temp=temp+s.charAt(i);
              }
              
        }

        System.out.println(temp);
        boolean ans=true;
       int j=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==temp.charAt(j))
            {
                j++;
                if(j==temp.length())
                {
                    j=0;
                }
                if(i==n-1 )
                {
                    if(j!=temp.length())
                        {
                            ans=false;
                        }
                }
            }
            else
            {
                 ans = false;
                 System.out.println(ans);
                 return;
            }
        }
        System.out.println(ans);
    }
    
}
