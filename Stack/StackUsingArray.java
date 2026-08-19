
import java.util.*;
class Solution
{
    Scanner sc = new Scanner(System.in);
    int arr[];
     int top =-1;
    Solution(int arr[])
    {
        this.arr = arr;   
    }
    void push()
    {
        if(!isFull())
        {
            System.out.println("Enter number :");
            int num =sc.nextInt() ;
            arr[++top] =num;
            System.out.println("Insert element is: "+""+arr[top]);
        }
        else{
            System.out.println("Stack is full");
        }
    }
     void pop()
     {
          if(!isEmpty())
          {
              
             System.out.println("Remove element is :"+arr[top--]) ;
          }
          else{
            System.out.println("Stack is empty:");
          }
     }

     void top() 
     {
        if( !isEmpty()) 
        {
            System.out.println("Top element is :"+" "+arr[top]);
        }
        else {
            System.out.println("Stack is Empty:");
        }

     }

     void display()
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
     }

     boolean isFull()
     {
        if(top==arr.length-1)
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
        if(top==-1)
        {
            return true;
        }
        else{
            return false;
        }
     }
}

public class StackUsingArray 
{
    public static void main(String args[])
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        Solution s =new Solution(arr);
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
