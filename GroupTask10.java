package ReplitHomework;


/*10. Write a program to print out duplicate elements from an Array of Strings?*/
public class GroupTask10 {
    public static void main(String[] args) {

        String [] duplicate = {"Love", "Love", "Love", "God", "God", "Love", "Love", "God", "Love"};

        // Create an array to store the frequency of each string

        int[] repeat = new int[duplicate.length];

        for (int i = 0; i < duplicate.length; i++) {
            for (int j = i + 1; j < duplicate.length; j++) {
                if (duplicate[i].equals(duplicate[j])) {
                    repeat[i]++;
                }
            }
        }

        for (int i = 0; i < repeat.length; i++) {
            if (repeat[i] > 0) {
                System.out.println(duplicate[i] + " ");
            }
        }

    }
}
