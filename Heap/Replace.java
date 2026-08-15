import java.util.*;

class ReplaceElement
{
    ReplaceElement(int a[])
    {
        int n=a.length;
        int temp[]=a.clone();
         Arrays.sort(temp);
         Map<Integer,Integer>rank=new HashMap<>();
         int r=1;
         for(int i=0;i<n;i++)
         {
            if(!rank.containsKey(temp[i]))
            {
                rank.put(temp[i],r++);

            }
         }

         for(int i=0;i<n;i++)
         {
            a[i]=rank.get(a[i]);
            System.out.println(a[i]);
         }
        

    }
}


public class Replace
{
    public static void main(String args[])
    {
        int a[]=new int[]{ 20, 15, 26, 2, 98, 6};
        ReplaceElement r1=new ReplaceElement(a);



    }
}