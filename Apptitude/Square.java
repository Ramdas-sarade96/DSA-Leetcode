import java.util.*;
public class Square 
{
    public static void main(String args[])
    {
        int base,power;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        base=sc.nextInt();
        System.out.println("Enter the Power:");
        power=sc.nextInt();
        int ans=1;
        for(int i=0;i<5;i++)
        {
           ans=ans*base;
        }

       System.out.println(ans);
    }
    
}
