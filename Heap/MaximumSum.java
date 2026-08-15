import java.util.*;


class Sum
{
    Sum(int arr1[],int arr2[],int k)
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
            
                 int temp=arr1[i]+arr2[j];
                 if(sum1<temp)
                 {
                    sum2=sum1;
                    sum1=temp;
                 }
                 else if(sum2<temp)
                 {
                    sum2=temp;
                 }
               
                 
            }
        }

        System.out.println("["+sum1+","+sum2+"]");
    }

}
public class MaximumSum 
{
    public static void main(String args[])
    {
        int arr1[]=new int[]{ 3, 4, 5};
        int arr2[]=new int[]{ 2, 6, 3};
        int k=2;
        Sum s1=new Sum(arr1,arr2,k);

    }
    
}
