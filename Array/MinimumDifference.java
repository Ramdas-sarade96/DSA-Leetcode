import java.util.*;
public class MinimumDifference 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{ 10, 1, 5, 9, 7};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        int k=3;
        Arrays.sort(arr);
        for(int i=0;i<=n-k;i++)
        {
            
                   min=arr[i];
                   max=arr[i+k-1];
                  int temp=max-min;
                  if(temp<ans) 
                  {
                    ans=temp;
                  }
            
        }
        System.out.println("Enter the temp value:");
        int temp2=sc.nextInt();
        System.err.println();

        System.out.println(ans);
    }
    
}
