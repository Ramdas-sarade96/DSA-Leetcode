import java.util.*;

public class Anagram 
{
    public static void main(String args[])
    {
        String start="anagram";
        String goal="nagaram";

        System.out.println(start.charAt(3));

       int count[]=new int[26];
       for(int i=0;i<start.length();i++)
       {
        count[start.charAt(i)-'a']++;
        System.out.println( count[start.charAt(i)-'a']++);
       }

       for(int i=0;i<goal.length();i++)
       {
        count[goal.charAt(i)-'a']--;
       }

       for(int i=0;i<26;i++)
       {
              if(count[i]!=0)
              {
                System.out.println(" not a anagram");
                return;
              }
       }

       System.out.println(" An a anagram");

        
    }
    
}
