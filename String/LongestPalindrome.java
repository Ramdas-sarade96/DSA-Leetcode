public class LongestPalindrome 
{
   static String result="";
    void check(String ans)
    {
        int n=ans.length();
        char ch[]=ans.toCharArray();
        int j=n-1;
       
        for(int i=0;i<(n/2);i++)
        {
            if(ch[i]!=ch[j])
            {
                return ;

            }
            j--;
            
        }
        if(result.length()<ans.length())
        {
            result=ans;
        }
      
          
    }
    LongestPalindrome(String s)
    {
        char ch[]=s.toCharArray();
        int n=s.length();
       
        for(int i=0;i<n;i++)
        {
             String ans="";
            for(int j=i;j<n;j++)
            {
                 ans=ans+ch[j];
                 check(ans);
            }
        }
        System.out.println(result);
    }

    public static void main(String args[])
    {
        String s="babad";
        LongestPalindrome l1=new LongestPalindrome(s);
    }
    
}
