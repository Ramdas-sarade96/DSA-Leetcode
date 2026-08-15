public class LargestOddNumberDSA 
{
    public static void main(String args[])
    {
        String s="123456";
        int n=s.length();
        String result="";
        for(int i=n-1;i>=0;i--)
        {
             int digit=s.charAt(i);
             if(digit%2==1)
             {
                result=s.substring(0,i+1);
                break;
             }
        }

        if(result.equals(""))
        {
            System.out.println("No any odd Number");
        }

        else{

            System.out.println(result);
        }
    }
    
}
