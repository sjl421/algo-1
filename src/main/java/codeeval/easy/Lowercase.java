package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Given a string write a program to convert it into lowercase.
 */
public class Lowercase {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(line.toLowerCase());
        }
    }
}
