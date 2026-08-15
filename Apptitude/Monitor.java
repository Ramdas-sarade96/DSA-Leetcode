public class Monitor
{
    public static void main(String args[])
    {
         int arr[]=new int[]{4,3 ,7, 2 ,6 ,1};
         int n=arr.length;
         int ans=0;
         int choose=Integer.MAX_VALUE;
         int temp;
         for(int i=0;i<n;i++)
         {
             temp=arr[i];
             if(temp<choose)
             {
                choose=temp;
                ans++;
             }
         }
         System.out.println(ans-1);


    }
}