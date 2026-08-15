public class Leetcode1550
{
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3,5,7 };
        int n = arr.length;
        int ans=0;
        boolean result=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                ans++;
            }

          
            else
            {
                    ans=0;
                    result=false;
            }

            if(ans==3)
            {
                System.out.println(true);
                return;
            }
        }
        System.out.println(result);
    }
}