import java.util.*;
public class Prime2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the numbe:");
       int n=sc.nextInt();
       int k=1;
       if(n==0 || n==1)
       {
        k=0;
       }

       for(int i=2;i*i<=n;i++)
       {
          if(n%i==0)
          {
            k=0;
            break;
          }
       }

       if(k!=0)
       {
         System.out.println("Number"+""+n+" "+" is prime");
       }
       else{

          System.out.println("Number"+""+n+" "+" is not prime");
       }

    }
    
}
