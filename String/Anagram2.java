import java.util.*;
public class Anagram2 
{
    public static void main(String args[])
    {
        String que="ramdas";
        String goal="saramk";
        int n1=que.length();
        int n2=goal.length();
        if(n1!=n2)
        {
            System.out.println(" Not a anagram");
            return;
        }
        
        int arr[]=new int[26];
        for(int i=0;i<n1;i++)
        {
            arr[que.charAt(i)-'a']++;
        }
        for(int i=0;i<n1;i++)
        {
             arr[goal.charAt(i)-'a']--;
        }
        for(int i=0;i<n1;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println(" not an anagram");
                return;
            }
        }
        System.out.println("anagram");
    }

    
}
