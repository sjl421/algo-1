package codeeval.easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class SetIntersection {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new FileReader(args[0]));
        String line;
        Set seen = new HashSet<Integer>();
        while ((line = buffer.readLine()) != null) {
            String[] sets = line.split(";");
            String[] numbersFromSet1 = sets[0].split(",");
            String[] numbersFromSet2 = sets[1].split(",");
            for (String item: numbersFromSet1) {
                seen.add(Integer.valueOf(item));
            }
            boolean isFirst = true;
            for (String item: numbersFromSet2) {
                if (seen.contains(Integer.valueOf(item))) {
                    if (isFirst) isFirst = false;
                    else System.out.print(",");
                    System.out.print(item);
                }
            }
            seen.clear();
            System.out.println();
        }
    }
}
