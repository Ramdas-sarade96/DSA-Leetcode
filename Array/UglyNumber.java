public class UglyNumber 
{
    public static void main(String args[])
    {
        int n=36;
        
        boolean ans=true;
        while(n>1)
        {
            if(n==1)
            {
                ans=true;
            }
            else if(n%2==0)
            {
                n=n/2;
                ans=true;

            }
            else if(n%3==0)
            {
               n=n/3;
               ans=true;
            }

            else if(n%5==0)
            {
                n=n/5;
                ans=true;
            }

           else  if(n%2!=0 && n%3!=0 && n%5!=0)
            {
                ans=false;
                System.out.println(ans);
                return;
            }

        }

        System.out.println(ans);

    }
    
}
