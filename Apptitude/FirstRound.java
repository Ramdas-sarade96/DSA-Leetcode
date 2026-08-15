import java.util.Scanner;
public class FirstRound 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the math marks");
        int math=sc.nextInt();
        System.out.println("Enter the Bio marks:");
        int bio=sc.nextInt();
        System.out.println("Enter the English");
        int eng=sc.nextInt();
        System.out.println("Enter the Hindi marks:");
        int hindi=sc.nextInt();
        System.out.println("Enter the Soial science marks:");
        int social=sc.nextInt();

       float  perc=((math+bio+eng+hindi+social)*100)/500;

        boolean jee=math>=90 && bio>=70 && perc>80;
        boolean medical=bio>=90 && perc>60;
        if(jee && medical)
        {
            System.out.println(" Both pass");

        }

        else if(jee)
        {
            System.out.println("Jee pass");
        }
        else if(medical)
        {
           System.out.println(" Medical pass");
        }
        else

            {
                System.out.println(" Fail in both");
            }


    }

    
}
