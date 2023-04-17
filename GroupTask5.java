package ReplitHomework;

/*5. Write a program to swap 2 numbers without a temporary variable?*/
public class GroupTask5 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Before swapping numbers:");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping numbers:");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
