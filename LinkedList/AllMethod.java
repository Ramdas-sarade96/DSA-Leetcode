import java.util.*;
class LinkedList
{
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }

    }
    Node head=null;
    // Insert from start
    void insertS(int val)
    {
        Node oneNode=new Node(val);
        oneNode.next=head;
        head=oneNode;


    }

    // Insert from End

    void insertE(int val)
    {
        Node oneNode=new Node(val);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=oneNode;
        oneNode.next=null;
        
    }


    // Delete from start

    void deleteS()
    {
      if(head==null)
      {
        System.out.println("There is no any node to delete:");
        return;
      }
        Node temp=head;
        temp=temp.next;
        head=temp;

    }

    //Delete from End

    void deleteE() 
    {
        if(head==null)
        {
            System.out.println("There is no any node to delete:");
            return;
        }

        Node temp=head;
        if(temp.next==null)
        {
            head=null;
            return;
        }
        while(temp.next.next!=null)
        {
             temp=temp.next;
        }
        temp.next=null;


    }

    // Inset from Middle

    void insertM(int index,int value)
    {
         Node oneNode=new Node(value);
         Node temp=head;
         for(int i=0;i<index-1;i++)
         {
            
            temp=temp.next;
            if(temp==null)
            {
                System.out.println("Index out of bounds");
                return;
            }
         }
          oneNode.next=temp.next;
         temp.next=oneNode;
    }
    


    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;

        }
        System.out.println("Null"+" ");
    }
    
}
public class AllMethod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          LinkedList list=new LinkedList();
        
          int ch;
          while(true)
          {
            System.out.println("1. Insert From a Start:");
            System.out.println("2.Insert from End:");
            System.out.println("3. Delete from Start");
            System.out.println("4.Insert from Middle");
            System.out.println("5. Display:");
            System.out.println("6.exit()");
            System.out.println("Enter your choice:");
             ch=sc.nextInt();
             switch(ch)
             {
                case 1:
                    {
                        System.out.println("Enter the value:");
                        int val=sc.nextInt();
                        list.insertS(val);
                        break;
                    }
                    case 2:
                        {
                            System.out.println("Enter the value");
                            int val=sc.nextInt();
                            list.insertE(val);
                            break;
                        }
                        case 3:
                            {
                                list.deleteS();
                            }
                            case 4:
                                {
                                    System.out.println("Enter the Index ");
                                    int index=sc.nextInt();
                                    System.out.println("Enter the value");
                                    int val=sc.nextInt();
                                    list.insertM(index,val);
                                    break;
                                }
                    case 5:
                        {
                            list.display();
                            break;
                        }
                        case 6:
                            {
                                System.exit(0);
                                break;
                            }

                            default:
                                {
                                    System.out.println("Choice the correct choice");
                                }
             }

          }

    }
}