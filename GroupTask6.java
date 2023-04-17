package ReplitHomework;

/* 6. Write a java program to check whether a given number is prime or not? */

import java.util.Scanner;

public class GroupTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scan.nextInt();
        boolean prime = false;

        if (number < 1) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = true;
                }
            }
            if (!prime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

    }
}
