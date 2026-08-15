import java.util.*;

public class Leetcode389 
{
    public static void main(String args[])
    {
        String s="";
        String t="y";
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           if(map.containsKey(arr1[i])) 
            {
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else
            {
                map.put(arr1[i],1);
            }
        }
   char ans=' ';
        for(int i=0;i<t.length();i++)
        {
            if(!map.containsKey(arr2[i]))
            {
                   ans=arr2[i];
            }
        }

        System.out.println(ans);
    }
    
}
