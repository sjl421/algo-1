package codeeval.easy;

import java.io.*;

public class ReverseWords {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.length() > 0) {
				String[] words = line.trim().split(" ");
				for (int i = words.length-1; i >= 0; i--) {
					System.out.print(words[i]);
					if (i > 0) System.out.print(" ");
				}
				System.out.println();
			}
		}
		reader.close();
	}
}