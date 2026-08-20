import java.util.*;

class Solution
{
    
     class Node
     {
             int value;
             Node next; 
             Node(int val)
             {
                 this.value = val;
                 this.next = null;
             }
     }
   
     Scanner sc = new Scanner(System.in);
     Node front = null;
     Node rear = null;
     int size =0; 
     void push()
     {
         System.out.println("Enter The element :");
         int n=sc.nextInt();
         Node newNode= new Node (n);
         if(size==0)
         {
                front = newNode;
                rear = newNode;
        }
        
        else
        {
             rear.next = newNode;
             rear = newNode;
        }
        size++;

     }

     void pop()
     {
         if(size==0)
         {
            System.out.println("Queue is empty there is no any element : ");
            return ;
         }
          System.out.println("Remove element is: "+front.value);
         front = front.next; 
         size--;
         if(size==0)
         {
            rear = null;
         }
         

     }

     void top ()
     {
            if(size==0)
            {
                System.out.println("Queue is empty there is no any element to display:\n");
                return ;
            }
            System.out.println("Top element is: "+front.value);
     }

     void  display()
     {
        if(size==0)
        {
            System.out.println("Queue is empty there is no any element to dispaly:\n");
            return;
        }
        Node temp = front;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }

     }
}

public class QueueUsingLinkedList 
{
    public static void main(String args[])
    {
                 Scanner sc = new Scanner(System.in) ;
         
         Solution s = new Solution();
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
    

