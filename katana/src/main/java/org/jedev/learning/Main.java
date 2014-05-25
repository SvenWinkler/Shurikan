package org.jedev.learning;

/**
 * Created by svnwnk on 25/05/14.
 */
import com.google.common.base.Strings;

import java.util.Random;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		System.out.println(triple("Hello World!"));
		System.out.println("My name is " + System.getProperty("jmodern.name"));
	}

	static String triple(String str) {
		return Strings.repeat(str, 3);
	}


	/**
	 * ## The Random String Generator
	 *
	 * This method doesn't do much, except for generating a random string. It:
	 *
	 *  * Generates a random string at a given length, `length`
	 *  * Uses only characters in the range given by `from` and `to`.
	 *
	 * Example:
	 *
	 * ```java
	 * randomString(new Random(), 'a', 'z', 10);
	 * ```
	 *
	 * @param r      the random number generator
	 * @param from   the first character in the character range, inclusive
	 * @param to     the last character in the character range, inclusive
	 * @param length the length of the generated string
	 * @return the generated string of length `length`
	 */
	public static String randomString(Random r, char from, char to, int length) {

		return r.ints(from, to + 1).limit(length).mapToObj(x -> Character.toString((char)x)).collect( Collectors.joining());
	}
}
