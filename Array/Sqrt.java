import java.util.*;
public class Sqrt 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double m=Math.sqrt(n);
        int ans=(int)m;
        if(ans*ans==n)
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");
        }
        
    }
    
}
