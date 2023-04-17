package ReplitHomework;

import java.util.Scanner;

public class GroupTask1 {/* 1. Create a program that uses an array to store a list of
    temperatures for a week, and then uses a loop to find
    the highest and lowest temperature for the week.*/

    public static void main(String[] args) {

       // double[] temperature = {60.5, 55.5, 95.5, 100.5, 78.6, 29.5, 48.5,};

        //create an array
        //ask the user for the temp
        //put that temp into the array
        //use a for loop to go through the temps
        //use a if/else statment in the for loop
            // if temp[i] > then the previous temp
                // that means that temp is the highest
            // else if temp[i] < all the temps
                // that means he temp is the lowest



        double Temp [] = new double[7];


        Scanner scan = new Scanner(System.in);
        double max = Temp[0];
        double min = Temp[1];

        for (int i = 0; i < Temp.length; i++) {
            Temp[i] = scan.nextDouble();
            if (Temp[i] > max){
                max = Temp[i];
            }
            if (Temp[i] < max){
                min = Temp[i];
            }
        }
        System.out.println("The highest temp is " + max + "with the lowest temp being " + min);
        }
    }


