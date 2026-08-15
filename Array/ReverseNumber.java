public class ReverseNumber 
{
    public static void main(String args[])
    {
        int n=121;
        int s=n;
        String ans="";
        int temp;
        while(n>0)
        {
          temp=n%10;
          ans=ans+temp;
          n=n/10;
        }
        int m=Integer.parseInt(ans);
        System.out.println(m);

        if(s==m)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
    
}
