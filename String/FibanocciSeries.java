public class FibanocciSeries
{
    public static void main(String arggs[] )
    {
        int n=10;
        int a=0,b=1;
        for(int i=1;i<n;i++)
        {
            System.out.println(a);
            int c=a+b;
            b=a;
            a=c;
        }
    }
}