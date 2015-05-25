package hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;

public class UtopianTree {

    static int treeHeight(int n) {
        return ((1 << ((n >> 1) + 1)) - 1) << n%2;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(treeHeight(Integer.parseInt(s)));
        }
    }
}
