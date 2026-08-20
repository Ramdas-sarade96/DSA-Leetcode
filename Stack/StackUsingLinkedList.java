import java.util.*;


class Solution
{
      class Node
      {
          int val;
          Node next;
          Node(int val)
          {
               this.val=val;
               this.next=null;
          }
      }

      Node top = null;
      Scanner sc = new Scanner(System.in);

      void push()
      {
          System.out.println("Enter the element:");
          int n = sc.nextInt();
          Node newNode = new Node(n);
          newNode.next=top;
          top=newNode;
          System.out.println("Pushed element is :"+n);
            
      }

      void pop()
      {
          if(top==null)
          {
               System.out.println("There is no any element to pop:");
               return;
          }
          System.out.println("Pop element is: "+top.val);
          top = top.next;

      }

      void top()
      {
          if(top==null)
          {
               System.out.println("Stack is empty so There is no any element on top:\n");
               return;
          }
          System.out.println("Top elemet is: "+top.val);
      }

      void display()
      {
          if(top==null)
          {
               System.out.println("There is no any element in stack \n");
               return;
          }

          Node temp=top;
          while(temp!=null)
          {
               System.out.println(temp.val);
               temp=temp.next;
          }
      }



}

public class StackUsingLinkedList 
{
        public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        Solution s =new Solution();
        while(true)
        {
             System.out.println("1.Push ");
             System.out.println("2.pop ");
             System.out.println("3.top");
             System.out.println("4.Exit");
             System.out.println("5.Display");
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
                                    System.exit(0);
                                }
                                case 5:
                                    {
                                        s.display();
                                    }
                                default:
                                    {
                                        System.out.println("Enter the correct choice");
                                    }

             }
        }
     }
       
}
