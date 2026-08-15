import java.util.*;
public class Vowels 
{
    public static void main(String args[])
    {
        String str="Ramdas";
        int n=str.length();
        int  count=0;
        for(int i=0;i<n;i++)
        {
              char c=str.charAt(i);
              if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'|| c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
              {
                  count++;
              }
        }

        System.out.println(count);
    }
    
}
