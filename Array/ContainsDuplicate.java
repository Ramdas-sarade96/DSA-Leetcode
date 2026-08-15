import java.lang.*;
public class ContainsDuplicate 
{
    public static void main(String args[])
    {
        int arr[]=new int[]{1,0,1,1};
        int k=1;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j] && Math.abs(i-j)<=k)
                {
                    System.out.println("True");
                    return;

                }
            }
        }

        System.out.println("false");

    }
    
}
