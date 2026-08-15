
import java.util.*;
class Hand
{
    boolean answer(int arr[],int n)
    {
        int size=arr.length;
        if(size%n!=0)
        {
          
           return false ;
        }
        Map<Integer,Integer> hand=new HashMap<>();
        int no=1;
        for(int i=0;i<size;i++)
        {
            int num=arr[i];
            if(!hand.containsKey(arr[i]))
            {
                hand.put(arr[i],1);
            }
            else
            {
                hand.put(arr[i],hand.get(num)+1);
            }
        }
        Arrays.sort(arr);


        for(int i=0;i<size;i++)
        {
            int startCard=arr[i];

            if(hand.get(startCard)==0)
            {
                continue;
            }

            for(int j=0;j<n;j++)
            {
                int currentCard=startCard+j;
                if(!hand.containsKey(currentCard) || hand.get(currentCard)==0)
                {
                    return false;
                }

                hand.put(currentCard,hand.get(currentCard)-1);
            }

        }

        return true;


    }
}


public class HandsOfStraights 
{
    public static void main(String args[])
    {
         int a[]=new int[]{1,2,3,6,2,3,4,7,9};
         int n=3;
         Hand h1=new Hand();
         System.out.println(h1.answer(a,n));
    }
    
}
