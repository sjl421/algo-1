package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author: Artur Khalikov
 */
public class FileUtils {

    public static int fileLength(File file) {
        int length = 0;
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                while (reader.readLine() != null)
                    length++;
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return length;
    }

    public static int[] getIntArrayFromFile(File file) {
        int length = fileLength(file);
        int[] array = new int[length];
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                String line;
                int i= 0;
                while ((line = reader.readLine()) != null) {
                    array[i++] = Integer.parseInt(line);
                }
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return array;
    }
}
