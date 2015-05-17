package codeeval.moderate;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author ahalikov
 */
public class DecodeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        while ((s = reader.readLine()) != null) {
            int decodeWays = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 >= s.length()) break;
                if (Integer.parseInt(s.substring(i, i+2)) <= 26)
                    decodeWays++;
            }
            System.out.println(decodeWays+1);
        }
        reader.close();
    }
}
