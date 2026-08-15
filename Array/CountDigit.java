import java.util.*;
public class CountDigit 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the string");
        s=sc.nextLine();
        int n=s.length();
        int m=n-1;
        char ch[]=s.toCharArray();
        for(int i=0;i<n/2;i++)
        {
            char temp;
            temp=ch[i];
            ch[i]=ch[m];
            ch[m]=temp;
            
            m--;
        }
  String ans=""; 
        for(int i=0;i<n;i++)
        {
             ans=ans+ch[i];
        }
        System.out.println(ans);
    }
    
}
