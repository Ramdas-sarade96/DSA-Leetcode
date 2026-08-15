import java.util.*;
class Large
{
    PriorityQueue<Integer> minHeap;
    int k;

    Large(int arr[],int k)
    {
        this.k=k;
        int n=arr.length;
        minHeap=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            minHeap.add(arr[i]);
            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }
    }

    void add(int value)
    {
        minHeap.add(value);
        if(minHeap.size()>k)
        {
            minHeap.poll();
        }
    }

   void display()
   {
     System.out.println(minHeap.peek());
   }
}



public class KthLargest 
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[]{ 7,5,4,2,1};
      int k=3;
      Large l1=new Large(a,k);
      l1.display();
      System.out.println("Enter the number:");
      int value=sc.nextInt();
      l1.add(value);
      l1.display();
    }
    
}
