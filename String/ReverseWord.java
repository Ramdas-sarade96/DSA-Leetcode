public class ReverseWord
{
    public static void main(String args[])
    {
        String s="Ramdas Sarade";
       s=s.trim();
        String ans[]=s.split("\\s+");
        String result="";
        int n=ans.length;
        
        for(int i=n-1;i>=0;i--)
        {
            result=result+ans[i];
            if(i!=0)
            {
                result=result+" ";
            }

        }

        System.out.println(result);

        
    }
}