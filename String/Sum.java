import java.util.*;
public class Sum
{
    public static void main(String args[])
    {
        int n=123;
        String str=Integer.toString(n);
        char arr[]=str.toCharArray();
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            int temp=arr[i]-'0';
            ans=ans+temp;
        }
        System.out.println(ans);
    }
    
}
