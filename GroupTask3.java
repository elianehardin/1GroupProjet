package ReplitHomework;


/*3. Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
*/
public class GroupTask3 {
    public static void main(String[] args) {
        int[][] num = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }

            }

            //System.out.println();
        }
    }

}

