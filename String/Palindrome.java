import java.util.*;
public class Palindrome 
{
    public static void main(String args[])
    {
        String str="Ramdas";
        char ch[]=str.toCharArray();
        int n=str.length();
        int j=n;
        for(int i=0;i<j/2;i++)
        {
            n--;
            char temp=ch[i];
            ch[i]=ch[n];
            ch[n]=temp;
            

        }
      String ans="";
        for(int i=0;i<j;i++)
        {
            ans=ans+ch[i];

        }

        System.out.println(ans);

    }
    
}
