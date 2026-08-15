import java.util.*;
public class Swap 
{
    public static void main(String args[])
    {
        int n=123;
        String s=Integer.toString(n);
        s=s.trim();
        char arr[]=s.toCharArray();
         int i=0;
         int size=arr.length;
         char temp=arr[i];
         arr[i]=arr[size-1];
         arr[size-1]=temp;
         String str="";
         for(int j=0;j<size;j++)
         {
              str=str+arr[j];
         }
         int ans=Integer.parseInt(str);
         System.out.println(ans);
        }

}
