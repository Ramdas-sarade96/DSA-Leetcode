import java.util.*;

class Solution
{
    int arr[];
    int rear =-1,front =-1;
    int capacity=0;
    Scanner sc = new Scanner(System.in);
    Solution(int arr[])
    {
        this.arr = arr;
        this.capacity=arr.length;
    }

    void push()
    {
        if(!isFull())
        {
            System.out.println("Enter a element:");
            int n=sc.nextInt();
            arr[++rear]=n;
             if(front==-1)
             {
                front=0;
                
             }

        }

        else
        {
            System.out.println("Queue is full");
        }
    }

    void pop()
    {
        if(!isEmpty())
        {
            System.out.println("Remove element is: "+ arr[front]);
           front++;

           if(front>rear)
           {
               front =-1;
               rear =-1;
           }
           
           

        }
        else{
            System.out.println("Queue is empty ...There is no any element to delete");
        }
    }
    void top()
    {
       if(!isEmpty())
       {
         System.out.println("Top element is:"+arr[front]);
       }
       else
       {
         System.out.println("There is no any element to display:");
       }
    }

    void display()
    {
        for(int i=front;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    boolean isFull()
    {
        if(rear==capacity-1)
            
        {
            return true;

        }
        else{
            return false;
        }
    }

    boolean isEmpty()
    {
        if(rear==-1 && front==-1)
        {
            return true;
        }
        else{
            return false;
        }
    }



}

public class QueueUsingArray 
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in) ;
         int arr[] = new int[10];
         Solution s = new Solution(arr);
         while(true) 
         {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Top");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    {
                         s.push();
                         break;
                    }
                    case 2:
                        {
                            s.pop();
                             break;
                        }
                        case 3:
                            {
                                s.top();
                                break;
                            }

                            case 4:
                                {
                                    s.display();
                                    break;

                                }
                                case 5:
                                    {
                                        System.exit(0);
                                    }
                                    default:
                                        {
                                            System.out.println("Choose the correct choice:");
                                        }
            }
         }
    }
    
}
