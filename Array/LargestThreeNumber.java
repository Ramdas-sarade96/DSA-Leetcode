import java.util.*;
public class LargestThreeNumber 
{
     public static void main(String args[])
     {
        int a=4;
        int b=39;
        int c=39;
        if(a>b && a>c)
        {
             System.out.println(" Greater number is:"+" "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Greater number is:"+" "+b);
        }
        else
        {
            System.out.println("Greater number is:"+" "+c);
        }
     }
}
