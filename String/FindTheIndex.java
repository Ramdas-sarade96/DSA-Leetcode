public class FindTheIndex 
{
    public static void main(String args[])
    {
        String question="sadbutsad";
        String ans="sad";
        int qn=question.length();
        int an=ans.length();
        if(an>qn)
        {
            System.out.println("-1");
            return;
        }
        for(int i=0;i<qn-an;i++)
        {
            String a=question.substring(i,i+an);
            if(a.equals(ans))
            {
                System.out.println(i);
                return;
            }
            
        }

        System.out.println("-1");
    }
    
}
