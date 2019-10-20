package warmup.repeaterstring;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    static long repeatedString(String s, long n) {

        Long repeatTimes= n/s.length() ;
        Long addMoreChar=n%s.length();
        char []chars= s.toCharArray();
        int noOfa=0;
        int noOfLastRep=0;
         for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if(c=='a'){
                noOfa++;
                if(addMoreChar>=(i+1)){
                    noOfLastRep++;
                }
            }

        }

        return repeatTimes*noOfa+noOfLastRep;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/coding/Documents/Tutorials/100DaysOfCode/output"));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
