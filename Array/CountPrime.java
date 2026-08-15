public class CountPrime 
{
    
    boolean isPrime(int no)
    {
        if(no<=1)
        {
            return false;
        }
        for(int i=2;i<no;i++)
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
        int a=10;
        int count=0;
    
        CountPrime c1=new CountPrime();

        for(int i=2;i<=a;i++)
        {
             if(c1.isPrime(i))
             {
                count++;
             }
             
        }
        System.out.println(count);
    }
    
}
