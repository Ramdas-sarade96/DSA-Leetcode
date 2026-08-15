public class LargestOddNumber 
{
    public static void main(String args[])
    {
        String s="4206";
        char ch[]=s.toCharArray();
        int n=s.length();
        int no;
        int k=0;
        no=Integer.parseInt(s);
        for(int i=n-1;i>=0;i--)
        {
            
            if(no%2==1)
            {
                System.out.println(no);
                k++;
                break;
            }
            else
            {
               no=no/10;
            }
            
        }
        if(k==0)
        {
            System.out.println("no any odd number ");
        }
    }
    
}
