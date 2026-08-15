import java.util.*;
public class OddEvenSum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            if(num%2==0)
            {
                even.add(num);
            }
            else if(num%2!=0)
            {
                odd.add(num);
            }
        }
    int evenSum=0;
        for(int i=0;i<even.size();i++)
        {
           evenSum=evenSum+even.get(i);    
        }
        int oddSum=0;
        for(int i=0;i<odd.size();i++)
        {
            oddSum=oddSum+odd.get(i);
        }
        if(evenSum>oddSum)
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("NO");
        }
    }
}
