package ReplitHomework;

 /* 2. Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array. */

import java.util.stream.IntStream;

public class GroupTask2 {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 60, 45, 100};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];


        }
        System.out.println("The total sum is " + sum);
    }
}

//int[] a = {10,20,30,40,50};
//int sum = IntStream.of(a).sum();
//System.out.println("The sum is " + sum);