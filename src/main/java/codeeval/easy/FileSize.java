package codeeval.easy;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File(args[0]);
        System.out.print(file.length());
    }
}
