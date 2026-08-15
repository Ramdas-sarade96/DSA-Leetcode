public class Leetcode344 
{
    public static void main(String args[])
    {
        String arr[]=new String[]{"h","e","l","l","o"};
        int n=arr.length;
        int m=n-1;
        for(int i=0;i<n/2;i++)
        {
                String temp=arr[i];
                arr[i]=arr[m];
                arr[m]= temp;
                m--;  
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
