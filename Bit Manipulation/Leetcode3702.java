public class Leetcode3702 
{
    public static void main(String args[])
    {
        int arr[] = new int[]{2,2,2,2};
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum = sum^arr[i];
        }
        if(sum!=0)
        {
            System.out.println(n);
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println(n-1);
                return;
            }
        }
       return;
    }
    
}
