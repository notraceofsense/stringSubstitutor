/**
 * Tool for converting names to ridiculous fake Japanese names from a
 * table found in 
 * <a href="https://twitter.com/Dxxnly/status/1618200473508679684">
 * this tweet.
 * </a>
 * @author notraceofsense
 * @version 1.0.0
 */

package ridiculousJapaneseNameGen;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
	static Hashtable<String, String> dictionary;
	
	/**
	 * Convert a name to ridiculous fake Japanese
	 * @param name the name to convert, in lowercase
	 * @return the converted name
	 */
	static String convertName(String name) {
		String out = "";
		
		String[] substrings = name.split(" ");
		
		for (String word : substrings) {
			String[] chars = word.split("");
			for (String ch : chars) {
				out += dictionary.get(ch);
			}
			out += " ";
		}
		
		return out;
	}
	
	public static void main(String[] args) {
		dictionary = new Hashtable<String, String>();
		
		// populate dictionary
		// TODO: Find a less brute-force way of doing this.
		// TODO: Create a method of using file based dictionaries.
		dictionary.put("a", "ka");
		dictionary.put("b", "tu");
		dictionary.put("c", "mi");
		dictionary.put("d", "te");
		dictionary.put("e", "ku");
		dictionary.put("f", "ru");
		dictionary.put("g", "ji");
		dictionary.put("h", "re");
		dictionary.put("i", "ki");
		dictionary.put("j", "zu");
		dictionary.put("k", "me");
		dictionary.put("l", "ta");
		dictionary.put("m", "rin");
		dictionary.put("n", "to");
		dictionary.put("o", "mo");
		dictionary.put("p", "no");
		dictionary.put("q", "ke");
		dictionary.put("r", "shi");
		dictionary.put("s", "su");
		dictionary.put("t", "chi");
		dictionary.put("u", "do");
		dictionary.put("v", "ru");
		dictionary.put("w", "mei");
		dictionary.put("x", "na");
		dictionary.put("y", "fu");
		dictionary.put("z", "ze");
		
		// get input
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter name to convert:");
		String in = sc.nextLine();
		System.err.println("Enter number of rounds:");
		int rounds = sc.nextInt();
		sc.close();
		
		in = in.toLowerCase();
		
		// do the thing
		for(int i = 0; i < rounds; i++) {
			in = convertName(in);
		}
		
		System.out.println(in);
	}
}
