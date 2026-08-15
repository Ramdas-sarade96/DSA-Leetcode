import java.util.*;
public class LargestNumber 
{
    public static void main(String args[])
    {
        int a[]=new int[]{ 3,8,5,9,41};
        int n=a.length;
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=String.valueOf(a[i]);
        }

        Arrays.sort(arr,(b,c)->(c+b).compareTo(b+c));
       String ans="";
        for(int i=0;i<n;i++)
        {
            ans=ans+arr[i];
                
        }
        System.out.println(ans);
    }
    
}
