import java.util.*;
public class IsDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        int n=str.length();
        char arr[]=str.toCharArray();
        if(Character.isDigit(arr[i]) && !Character.isDigit(arr[n-1]))
        {
            System.out.println("Yes");
        }
        else if(!Character.isDigit(arr[i])  && Character.isDigit(arr[n-1]))
        {
            System.out.println("No");
        }
    }

}