import java.util.Scanner;

public class Prime 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        
        int k=0;
        if(a==0||a==1)
        {
            k=1;
        }
        for(int i=2;i<=(a/2);i++)
        {
            if(a%i==0)
            {
                k++;
            }

        }

        if(k==0)
        {
            System.out.println(a+" "+"is prime");
        }
        else{
            System.out.println(a+" "+" is not a prime");
        }
    }

    
}
