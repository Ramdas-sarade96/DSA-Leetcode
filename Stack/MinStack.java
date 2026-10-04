import java.util.*;
class Solution
{
    Scanner sc = new Scanner(System.in);
      Stack<Pair>st = new Stack<>();
      int size =0;
     class Pair
    {
        int first;
        int second;
        Pair(int first,int second)
        {
            this.first = first;
            this.second = second;
        }

         @Override
         public String toString()
        {
             return "Value = " + first + ", Min = " + second;
        }
    }

         void push()
         {
               
               System.out.println("Enter the element:");
               int n = sc.nextInt();
               if(st.isEmpty())
               {
                   st.push(new Pair(n,n));
               }
               else
               {
                    Pair p =st.peek();
                    if(n<p.second) 
                    {
                        st.push(new Pair(n,n));
                    }
                    else
                    {
                        st.push(new Pair(n,p.second));
                    }
               }
         }

         void pop()
         {
            if(!st.isEmpty())
            {
                System.out.println(st.pop());
            }
            else
            {
                System.out.println("Stack is empty:");
            }
               
         }

         void top()
         { 
            if(!st.isEmpty())
            {
                System.out.println(st.peek());
            }
            else
            {
                System.out.println("Stack is empty:");
            }
              
         }

         void minStack()
         {
               if(!st.isEmpty())
            {
                Pair p = st.peek();
                System.out.println(p.second);
            }
            else
            {
                System.out.println("Stack is empty:");
            }
         }

         void display()
         {
            if(st.isEmpty())
            {
                System.out.println("Stack is empty: ");
                return;
            }

            for(Pair p:st)
            {
                 System.out.println(p);
            }
         }


}

public class MinStack 
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
             System.out.println("5.minStack");
             System.out.println("6.Display");
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
                                        s.minStack();
                                        break;
                                    }
                                    case 6:
                                        {
                                            s.display();
                                            break;
                                        }
                                default:
                                    {
                                        System.out.println("Enter the correct choice");
                                    }

             }
        }
    }
    
}
