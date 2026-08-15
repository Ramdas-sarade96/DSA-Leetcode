// Give a string if in a string 5 is occur then insted of 5 print b, for 6 print c, for 9 print d

import java.util.*;
public class Dloitte2 
{

    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            int  n=str.length();
            char arr[]=str.toCharArray();
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<n;i++)
            {
                int temp=arr[i]-'0';

                if(temp==5)
                {
                   ans.append('b');
                }
                else if(temp==6)
                {
                    ans.append('c');
                }

                else if(temp==9)
                {
                    ans.append('d');
                }
            }

            System.out.println(ans.toString());
    }
    
}
