import java.util.Scanner;
public class ConvertToBinary
{
    void Binary(int  x)
    {
        String sum="";
        while(x>0)
        {
            int m=x%2;
            String temp=Integer.toString(m);
            sum=temp+sum;
            x=x/2;

        }
    
        System.out.println(sum);

    }

    public static void main(String args[])
    {
       ConvertToBinary b1=new ConvertToBinary();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enther the number");
       int m=sc.nextInt();
       
       b1.Binary(m);

    }
}