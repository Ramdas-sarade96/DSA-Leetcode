import java.util.*;
public class SwapNumber 
{
    public static void main(String args[])
    {
        int a=5;
        int b=6;
        System.out.println("Before the swapping:");
         System.out.println("a"+"="+a);
        System.out.println("b"+"="+b);
        
        a=a^b;
        b=b^a;
        a=b^a;
        System.out.println("After the swapping:");
        System.out.println("a"+"="+a);
        System.out.println("b"+"="+b);

    }
    
}
