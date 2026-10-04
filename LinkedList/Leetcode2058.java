
class Solution
{
    class Node
    {
        int value;
        Node next;
        Node(int value)
        {
               this.value = value;
               next = null;
        }
    }


    public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        int i=0;
        Node temp = head;
        Node previous;
        int arr[]=new int[]{-1,-1};
        int minima=-1,maxima=-1;
        int secondMaxima =-1;

         while(temp.next!=null)
         {
               previous = temp;
               temp=temp.next;
               if(temp.value<previous.value && temp.value<temp.next.value)
               {
                   if(maxima>=secondMaxima)
                   {
                      secondMaxima = maxima;
                      minima= i+1;
                      minima = Math.min(minima,maxima);
                      maxima = Math.max(minima,maxima);
                   }
               }
               if(temp.value>previous.value && temp.value>temp.next.value)
               {
                   
                   if(maxima>=secondMaxima)
                   {
                        secondMaxima = maxima;
                        maxima = i+1;
                        maxima = Math.max(minima,maxima);
                        maxima = Math.min(maxima,minima);
                   }
               }

               i++;

         }
         if(minima==-1 && maxima==1)
         {

            return arr;
         }
         else
         {
            minima = minima-maxima;
            maxima = maxima-secondMaxima;
            arr[0]=minima;
            arr[1] = maxima;
            return arr;
         }
    }
}

public class Leetcode2058 
{
        public static void main(String args[])
        {

        }
    
}
