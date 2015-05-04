package codeeval.easy.FizzBuzz;

import java.io.*;
import java.util.Scanner;

/**
 * FizzBuzz challenge
 */
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            fizzBuzz(line.trim());
        }
    }

    public static void fizzBuzz(String str) {
        Scanner sc = new Scanner(str);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            int modX = i % x;
            int modY = i % y;
            if (modX == 0 && modY == 0)
                System.out.print("FB");
            else if (modX == 0)
                System.out.print('F');
            else if (modY == 0)
                System.out.print('B');
            else
                System.out.print(i);
            if (i < n)
                System.out.print(' ');
        }
        System.out.println();
    }
}
