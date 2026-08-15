public class AllPrime
{
    
    int isPrime(int no)
    {
        if(no<=1)
        {
            return 0;
        }
        for(int i=2;i<no;i++)
        {
            if(no%i==0)
            {
                return 0;
            }
        }
        return no;
    }
    public static void main(String args[])
    {
        int a=10;
        int count=0;
    
        AllPrime c1=new AllPrime();

        for(int i=2;i<=a;i++)
        {
            int k=c1.isPrime(i);
                if(k!=0)
                {
                     System.out.println(k);
                }
        
            
        
             
        }
    }
    
}
