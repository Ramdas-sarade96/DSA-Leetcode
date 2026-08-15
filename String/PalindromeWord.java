public class PalindromeWord
{
    public static void main(String args[])
    {
        String s="Ramdas Sarade Ramdas";
       s=s.trim();
        String ans[]=s.split("\\s+");
        String result="";
        int n=ans.length;
        String temp="";

        for(int i=0;i<n;i++)
        {
            temp=temp+ans[i];
            if(i!=n-1)
            {
                temp=temp+" ";
            }
        }
        
        for(int i=n-1;i>=0;i--)
        {
            result=result+ans[i];
            if(i!=0)
            {
                result=result+" ";
            }

        }

        System.out.println(result);

        if(temp.equals(result))
        {
            System.out.println(s+" "+" String is palindrime");
        }
        else{
            System.out.println(s+" "+" Not a Palindrome");
        }

        
    }
}