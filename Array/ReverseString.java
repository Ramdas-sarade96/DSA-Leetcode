import java.util.*;
public class ReverseString
{
    public static void main(String args[])
    {
        String str="ramdas";
        int n=str.length();
         char arr[]=str.toCharArray();
        for(int i=0;i<n/2;i++)
        {
           char temp=arr[i];
             arr[i]=arr[n-1-i];
             arr[n-1-i]=temp;
            
        }
        String ans="";
        for(int i=0;i<n;i++)
        {
            ans=ans+arr[i];
        }

        System.out.println(ans);
    }

}