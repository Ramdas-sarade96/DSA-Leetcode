import java.util.*;
public class Fibanocci 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int start=0;
        int next=1;
        int temp;
        int ans;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                System.out.println(start);
            }
            if(i==1)
            {
                System.out.println(next);
            }

            else
            {
                ans=start+next;
                System.out.println(ans);
                start=next;
                next=ans;
            }
        }
    }   
}
