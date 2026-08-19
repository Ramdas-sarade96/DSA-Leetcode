import java.util.Scanner;

 class  Solution
{
    int arr[];
    Scanner sc = new Scanner(System.in);
   Solution (int arr[])
    {
        this.arr = arr;

    }
    int size = arr.length;
    int capacity =0;
    int rear=-1,front=-1;

    void push()
    {
        System.out.println("Enter the element");
        int element = sc.nextInt();
        if(isFull())
        {
            System.out.println("Queue is full\n");
            return;
        }
        if(capacity==0)
        {
            front=0;
            rear=0;
        }
        capacity++;
        arr[rear]=element;
        rear =(rear+1)%size;
        
    }

    void pop()
    {
         
        if(isEmpty())
        {
               System.out.println("Queue is empty\n");
               return;
        }
        int temp=arr[front];
        if(capacity==1)
        {
             System.out.println("Rmove element is :"+temp);
            front =-1;
            rear=-1;
        }
        else
        {
             
              System.out.println("Rmove element is :"+temp);
              front= (front+1)%size;
              
        }
        capacity--;
    }

    void top() 
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty\n");
        }
        else
        {
            System.out.println("Top Element is: "+arr[front]);
        }
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("There is no any element to display:\n");
            return;

        }
       int temp=front;
       for(int i=0;i<capacity;i++)
       {
        System.out.println(arr[temp]);
        temp = (temp+1)%size;
       }
    }

    boolean isFull()
    {
        if(capacity==size)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isEmpty()
    {
        if(capacity==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


public class CircularQueueUsingArray
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
}
