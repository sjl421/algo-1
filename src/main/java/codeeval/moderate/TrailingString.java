package codeeval.moderate;

import java.io.*;

/**
 * There are two strings: A and B.
 * Print 1 if string B occurs at the end of string A. Otherwise, print 0.
 */
public class TrailingString {
    public static void main(String[] args) throws Exception {
    	BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
    	String line;
    	while ((line = reader.readLine()) != null) {
    		String[] sentences = line.split(",");
    		System.out.println(isTrailingString(sentences[0], sentences[1]) ? 1: 0);
    	}
    	reader.close();
    }

	/**
	 * O(n), where n = length(str)
	 * @param subject
	 * @param str
	 * @return
	 */
    static boolean isTrailingString(String subject, String str) {
    	if (str.length() > subject.length())
    		return false;
		int j = subject.length()-1;
    	for (int i = str.length()-1; i >= 0; i--) {
    		if (str.charAt(i) != subject.charAt(j--))
    			return false;
    	}
    	return true;
    }

	/**
	 * This solution does not work on some tests, why ?
	 * @param subject
	 * @param str
	 * @return
	 */
	static boolean isTrailingString2(String subject, String str) {
		if (str.length() > subject.length())
			return false;
		String[] strTokens = str.split(" ");
		String[] subjectTokens = subject.split(" ");
		if (strTokens.length > subjectTokens.length)
			return false;
		int j = subjectTokens.length-1;
		for (int i = strTokens.length-1; i >= 0; i--) {
			if (strTokens[i].hashCode() != subjectTokens[j--].hashCode())
				return false;
		}
		return true;
	}
 }
