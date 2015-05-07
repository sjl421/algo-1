package codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a program which removes specific characters from a string.
 */
public class RemoveCharacters {
    public static void main(String[] args) throws Exception {
       	BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
		String line;
       	while ((line = reader.readLine()) != null) {
       		String[] tokens = line.split(",");
       		Set scrub = new HashSet();
       		
       		for (char c: tokens[1].trim().toCharArray())
       			scrub.add(c);

       		StringBuilder sb = new StringBuilder();
       		for (char c: tokens[0].trim().toCharArray()) {
       			if (!scrub.contains(c)) {
       				sb.append(c);
       			}
       		}
       		System.out.println(sb.toString());
       	}
       	reader.close();
    }
}
