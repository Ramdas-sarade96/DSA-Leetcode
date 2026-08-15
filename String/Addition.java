import java.util.*;
public class Addition 
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        if(sum<100)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }

    }
    
}
