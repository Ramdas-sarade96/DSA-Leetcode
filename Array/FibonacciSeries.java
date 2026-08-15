import java.util.*;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int n = sc.nextInt();

        int start = 0;
        int next = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");

            int temp = start + next;
            start = next;
            next = temp;
        }
    }
}