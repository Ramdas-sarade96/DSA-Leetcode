
import java.util.*;
public class Leetcode1005 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the total numbers");
        int total_n=sc.nextInt();
        int arr[]=new int[total_n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<total_n;i++)
        {
              arr[i]=sc.nextInt();
        }

        int n=arr.length;
        System.out.println("Enter k:");
        int k=sc.nextInt();
        Arrays.sort(arr);
        
        for(int i=0;i<k && i<total_n;i++)
        {
            arr[i]=-arr[i];
        }
         int sum=0;
         for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println ("Total sum \n\n\n");
        System.out.println(sum);

        for(int k<0;)
    }
    
}
