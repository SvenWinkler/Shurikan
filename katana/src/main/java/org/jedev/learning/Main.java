package org.jedev.learning;

/**
 * Created by svnwnk on 25/05/14.
 */
import com.google.common.base.Strings;

public class Main {
	public static void main(String[] args) {
		System.out.println(triple("Hello World!"));
		System.out.println("My name is " + System.getProperty("jmodern.name"));
	}

	static String triple(String str) {
		return Strings.repeat(str, 3);
	}
}