package arrays.newyearchaos;

import java.util.Scanner;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int totalSwaps = 0;
        for (int i = q.length - 1; i >= 0; i--) {


            //System.out.println("Current Elment "+currentElement +"at Position"+i);

            //Each Position Must be at its own position, its position is i-1,
            // If bribed it will be at
            if (q[i] != i + 1) {
                if (((i - 1) >= 0) && q[i - 1] == (i + 1)) {
                    totalSwaps++;
                    swap(q, i, i - 1);
                }

             else if (((i - 2) >= 0) && q[i - 2] == (i + 1)) {
                totalSwaps += 2;
                swap(q, i - 2, i - 1);
                swap(q, i - 1, i);
            } else {
                System.out.println("Too Chaotic");
                return;
            }
            }

        }
        System.out.println(totalSwaps);
    }

    private static void swap(int[] q, int i, int j) {
        int k = q[i];
        q[i] = q[j];
        q[j] = k;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] q = {1, 2, 5, 3, 4, 7, 8, 6};
        minimumBribes(q);

    }


}
