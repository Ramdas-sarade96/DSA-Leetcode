import java.util.*;
public class Prime 
{
      boolean prime(int no)
    {
        if(no<2)
        {
            return false;
        }
        for(int i=2;i*i<=no;i++)
        {
            if(no%i==0)
            {
                return false; 
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        int n=sc.nextInt();
        Prime p1=new Prime();
        int k=0;
       
        String s=Integer.toString(n);
        int size=s.length();
        char arr[]=s.toCharArray();
        int ans[]=new int[100];
        for(int i=0;i<size;i++)
        {
            String add="";
            for(int j=i;j<size;j++)
            {
               
               add=add+arr[j];
               int send=Integer.parseInt(add);
              
                if(p1.prime(send))
                {
                    ans[k++]=send;
                }

            }
            
        }
          int result[]=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=ans[i];
             
        }

        Arrays.sort(result);
        for(int i=0;i<k;i++)
        {
            System.out.println(result[i]);
        }
       

    

       
    }
    
}
