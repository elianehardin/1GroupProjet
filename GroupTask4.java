package ReplitHomework;
/*4. Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.
*/
public class GroupTask4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {6, 12, 24, 2},
                {10, 3, 2, 4},
                {6, 5, 11, 20}
        };

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumEven += numbers[i][j];
                } else if (numbers[i][j] % 2 != 0) {
                    sumOdd += numbers[i][j];
                }
            }
        }

        System.out.println("The Sum of Even Numbers is = " + sumEven);
        System.out.println("The Sum of Odd Numbers is = " + sumOdd);


    }
}


