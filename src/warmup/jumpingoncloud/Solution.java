package warmup.jumpingoncloud;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jumps=0;
        int currentPos=0;
        while(currentPos <= (c.length - 1)){
            if (currentPos == (c.length - 1)) {
                return jumps;
            }
            if ((currentPos+2<=c.length-1)&& c[currentPos + 2] == 1 && c[currentPos + 1]==0  ) {
                jumps++;
                currentPos ++;
            } else if ((currentPos+2<=c.length-1)&& ((c[currentPos + 1] == 1)||(c[currentPos+2]==0))){
                jumps++;
                currentPos += 2;
        }else if(c[currentPos+1]==0){
                jumps++;
                currentPos ++;
            }
        }
        return jumps;

    }
    //Approach 2 Sleak
    /*
    static int jumpingOnClouds2(int[] c) {

        int jumps=0;
        int currentPos=0;
        int totalCloud=c.length - 1 ;
        while(currentPos != totalCloud){
           //When can it jump
            boolean shouldJump= ((currentPos+2)<=(totalCloud)) && (c[currentPos+2]==0);
           currentPos+=shouldJump?2:1;
            jumps++;
        }
        return jumps;

    }

     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/coding/Documents/Tutorials/100DaysOfCode/output"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
