import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse from right to left
          for (int i = s.length() - 1; i >= 0; i--) 
          {
              int value = roman.get(s.charAt(i));

            if (value < prevValue)
           {
                total -= value;
           }
             else 
          {
                total += value;
          }

            prevValue = value;
        }

        return total;
    }

    // Test the function
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Roman Number:");
        String no=sc.nextLine();

       System.out.println(romanToInt(no));

     
        
    }
}
