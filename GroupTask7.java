package ReplitHomework;

/*7. Write a Java Program to print the first 10 numbers of Fibonacci series.Example:  2 (1+1), 3 (1+2), 5 (2+3), 8 (3+5) */
public class GroupTask7 {
    public static void main(String[] args) {
        int n = 10;
        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}