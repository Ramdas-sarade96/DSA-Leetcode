import java.util.*;

interface Student
{
     void learn();
}
class Teacher implements Student
{
      int age;
      int sub;
      public void learn()
      {
         System.out.println("Hello");
      }
      
      void teach(int s,int m)
      {
         age=s;
      }
}

public class Practice
{
  
    public static void main(String args[])
    {
      Teacher t1=new Teacher();
       t1.teach(6,7);
       int k=++t1.age;
       System.out.println(k);
      
      

    }
}