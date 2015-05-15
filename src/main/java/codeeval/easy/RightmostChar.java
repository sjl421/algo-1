package codeeval.easy;

import java.io.BufferedReader;
import java.io.FileReader;

public class RightmostChar {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        while ((s = reader.readLine()) != null) {
            printRightmostChar(s.split(","));
        }
        reader.close();
    }

    private static void printRightmostChar(String[] parts) {
        int found = -1;
        if (parts.length > 0) {
            int n = parts[0].length();
            for (int i = n - 1; i >= 0; i--) {
                if (parts[0].charAt(i) == parts[1].charAt(0)) {
                    found = i;
                    break;
                }
            }
        }
        System.out.println(found);
    }
}
