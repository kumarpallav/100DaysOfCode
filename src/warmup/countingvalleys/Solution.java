package warmup.countingvalleys;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char []steps=s.toCharArray();
        Integer seaLevel=0;
        Integer vallleys=0;
        boolean valleyStarted=false;
        //for Each Step U Add 1 and D subs -1
        for(char step:steps){
            if(step=='U'){
                seaLevel++;
             }else if(step=='D'){
                seaLevel--;
                if(seaLevel==-1){
                    valleyStarted=true;
                }
            }
            if(valleyStarted && seaLevel==0){
                valleyStarted=false;
                vallleys++;
            }

        }
    return vallleys;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

      System.out.println(result);
        scanner.close();
    }
}
